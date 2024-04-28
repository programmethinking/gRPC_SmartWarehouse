package com.ncirl.util;
import java.util.Random;

public class HumidityUtil {

    public static String getWarehouseHumidity() {
        Random random = new Random();
        double minHumidity = -20.0; //  min humidity
        double maxHumidity = 40.0; // max humidity
        double humidityRange = maxHumidity - minHumidity;
        double randomTemperatureOffset = random.nextDouble() * humidityRange; // generate random humidity
        double temperature = minHumidity + randomTemperatureOffset;
        return String.format("%.2f", temperature) + "";
    }


}
