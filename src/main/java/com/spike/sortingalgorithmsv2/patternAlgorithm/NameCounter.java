package com.spike.sortingalgorithmsv2.patternAlgorithm;

import com.spike.sortingalgorithmsv2.entities.Employer;
import com.spike.sortingalgorithmsv2.entities.NameCount;
import com.spike.sortingalgorithmsv2.repositories.EmployerRepository;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class NameCounter {
    private final EmployerRepository employerRepository;

    public NameCounter(EmployerRepository employerRepository) throws IOException {
        this.employerRepository = employerRepository;
    }

    String command = "C:\\Users\\7ermi\\Downloads\\name_counter.exe";

    public List<NameCount> count() {

        try {
            Process process = new ProcessBuilder(command).start();
            BufferedWriter writer = new BufferedWriter(
                    new OutputStreamWriter(process.getOutputStream()));
            for (Employer employer : employerRepository.findAll()) {
                writer.write(employer.getFirstName() + "\n");
            }
            writer.close();

            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    process.getInputStream()));
            int nameCount = Integer.parseInt(reader.readLine());
            List<NameCount> result = new ArrayList<>();
            for(int i = 0; i<nameCount; i++ ) {
                String name = reader.readLine();
                Integer count = Integer.valueOf(reader.readLine());
                result.add(new NameCount(name, count));
            }
                reader.close();
            return result;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
