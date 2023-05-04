package com.spike.sortingalgorithmsv2.patternAlgorithm;

import com.spike.sortingalgorithmsv2.entities.Employer;
import com.spike.sortingalgorithmsv2.repositories.EmployerRepository;
import org.springframework.stereotype.Component;

import java.io.*;

@Component
public class WildcardMatcher {

    private final EmployerRepository employerRepository;

    public WildcardMatcher(EmployerRepository employerRepository) throws IOException {
        this.employerRepository = employerRepository;
    }

    String command = "C:\\Users\\7ermi\\Downloads\\wildcard-matcher.exe";

    public Integer wildcardCounter() {

        try {
            Process process = new ProcessBuilder(command).start();
            BufferedWriter writer = new BufferedWriter(
                    new OutputStreamWriter(process.getOutputStream()));
            writer.write("John*\n");
            for (Employer employer : employerRepository.findAll()) {
                writer.write(employer.getFirstName() + "\n");
            }
            writer.close();

            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    process.getInputStream()));
            int nameCount = Integer.parseInt(reader.readLine());
            reader.close();
            return nameCount;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}


