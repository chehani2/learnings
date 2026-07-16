package com.learining.java_high_performance._development.input_output.read_wtiters.challange;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExercise {

    // This method should return the first line of BufferedReaderVsScanner.txt.
    String getFirstLine() {
        String firstLine = "";
        try(BufferedReader reader = new BufferedReader(new FileReader("src/main/java/_06_06/BufferedReaderVsScanner.txt"))) {
            firstLine = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return firstLine;
    }

    // This method should return all of the content of BufferedReaderVsScanner.txt
    // as a single String.
    String getWholeFile() {
        String wholeFile = "";
        try(BufferedReader reader = new BufferedReader(new FileReader("src/main/java/_06_06/BufferedReaderVsScanner.txt"))) {
            StringBuilder stringBuilder = new StringBuilder();
            reader.lines().forEach(line -> stringBuilder.append(line + " "));
            wholeFile = stringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wholeFile;
    }

}
