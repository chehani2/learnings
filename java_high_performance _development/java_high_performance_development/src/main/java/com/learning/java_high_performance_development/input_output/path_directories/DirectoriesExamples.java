package com.learning.java_high_performance_development.input_output.path_directories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DirectoriesExamples {

    public static void main(String[] args) {

        try {
            Files.list(Paths.get("."))
                    .filter(file -> !Files.isDirectory(file))
                    .forEach(System.out::println);

            if(Files.notExists(Paths.get("src/main/java/learning.java_high_performance_development/input_output/path_directories/example"))) {
                Files.createDirectory(Paths.get("src/main/java/learning.java_high_performance_development/input_output/path_directories/example"));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
