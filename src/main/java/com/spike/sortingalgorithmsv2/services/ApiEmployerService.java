package com.spike.sortingalgorithmsv2.services;


import com.spike.sortingalgorithmsv2.entities.Employer;
import com.spike.sortingalgorithmsv2.entities.Profession;
import com.spike.sortingalgorithmsv2.repositories.ProfessionRepository;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class ApiEmployerService {

    private final ProfessionRepository professionRepository;

    public ApiEmployerService(ProfessionRepository professionRepository) {
        this.professionRepository = professionRepository;
    }

    public ResponseEntity<?> getEmployerFromApi() {
        Employer employer;
        try {
            employer = getEmployer();
        } catch (IOException e) {
            System.err.println("YOUR MOTHER'S HEAD\nError: "+e);
            return ResponseEntity.internalServerError().body(e);
        }
        if (employer != null) {
            return ResponseEntity.ok(employer);
        }
        return null;
    }

    public Employer getEmployer() throws IOException {
        String url = "https://random-data-api.com/api/v2/users";
        MediaType JSON = MediaType.parse("application/json; charset=utf-8");
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .addHeader("Accept", "application/json")
                .addHeader("charset", "utf-8")
                .build();

        Response response = client.newCall(request).execute();
        JSONObject responseToJSON = convertResponseToJSONObject(response.body().string());
        return deserializeResponseData(responseToJSON);

    }

    private JSONObject convertResponseToJSONObject(String bodyData) {
        //Convert to JSON
        JSONObject jsonObj = new JSONObject(bodyData.toString());
        return jsonObj;
    }

    public Employer deserializeResponseData(JSONObject data) {
        JSONObject object = new JSONObject(data.toString());
        Employer apiEmployer = new Employer();

        try {
            apiEmployer.setEmail(object.getString("email"));
            apiEmployer.setFirstName(object.getString("first_name"));
            apiEmployer.setLastName(object.getString("last_name"));
            apiEmployer.setSalary(257);

            String professionTitle = object.getJSONObject("employment").getString("title");
            List<Profession> existingMatchingProfessions = professionRepository.findByTitle(professionTitle);
            Profession profession;
            if (existingMatchingProfessions.isEmpty()) {
                profession = professionRepository.save(new Profession(professionTitle));
            } else {
                profession = existingMatchingProfessions.get(0);
            }
            apiEmployer.setProfession(profession);
        } catch (JSONException e) {
            System.err.println("YOUR MOTHER'S ASS\nError: " + e);
        }

        return apiEmployer;

    }
}
