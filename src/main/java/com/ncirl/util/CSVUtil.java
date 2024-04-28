package com.ncirl.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CSVUtil {

    // Appends a string to the specified file
    public static void appendStringToFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.append(content);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Error appending string to file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Tests methods for appending strings to files
        String filePath = "example.csv"; // You need to specify the path to the CSV file


        String content = "Data1,Data2,Data3";
        CSVUtil.appendStringToFile(filePath, content);
    }
}

