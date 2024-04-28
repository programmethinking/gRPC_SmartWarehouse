package com.ncirl.util;
import java.util.Random;

public class TemperatureUtil {

    public static String getWarehouseTemperature() {
        // Simulate the logic of obtaining temperature, where a random number is used to generate a temperature value
        Random random = new Random();
        double minTemperature = -20.0; // max temperature
        double maxTemperature = 40.0; // min temperature
        double temperatureRange = maxTemperature - minTemperature;
        double randomTemperatureOffset = random.nextDouble() * temperatureRange; // Generate random temperature offsets
        double temperature = minTemperature + randomTemperatureOffset;
        return String.format("%.2f", temperature) + "°C";
    }



    public static void main(String[] args) {
        // Test the method of obtaining the real-time temperature of the warehouse
        String warehouseTemperature = TemperatureUtil.getWarehouseTemperature();

        System.out.println("Warehouse Temperature: "+warehouseTemperature );
    }

}
