package com.ncirl.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeUtil {

    // Gets the current time and formats it as a string (exact time minutes and seconds)
    public static String getCurrentTime() {
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedTime = currentTime.format(formatter);
        return formattedTime;
    }

    public static void main(String[] args) {
        // Test the method for getting the current time
        String currentTime = TimeUtil.getCurrentTime();
        System.out.println("Current Time: " + currentTime);
    }
}

