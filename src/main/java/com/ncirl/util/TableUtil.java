package com.ncirl.util;

import com.ncirl.streaming.storeservice.ProductInfo;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class TableUtil {

    public static void showProductInfos(List<ProductInfo> productInfos) {
        if (productInfos == null || productInfos.isEmpty()) {
            System.out.println("No product information available.");
            return;
        }
        String[] headers = {"Product No", "Count"};
        String[][] data = new String[productInfos.size() + 1][2];
        data[0] = headers;

        for (int i = 0; i < productInfos.size(); i++) {
            ProductInfo productInfo = productInfos.get(i);
            data[i + 1][0] = productInfo.getProductNo();
            data[i + 1][1] = String.valueOf(productInfo.getCount());
        }

        printTable(data);
    }

    private static void printTable(String[][] data) {
        int[] maxLengths = new int[data[0].length];
        for (String[] row : data) {
            for (int i = 0; i < row.length; i++) {
                if (row[i].length() > maxLengths[i]) {
                    maxLengths[i] = row[i].length();
                }
            }
        }

        for (String[] row : data) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < row.length; i++) {
                sb.append(row[i]);
                int spaces = maxLengths[i] - row[i].length();
                for (int j = 0; j < spaces; j++) {
                    sb.append(" ");
                }
                sb.append("   "); // Add spacing between columns
            }
            System.out.println(sb.toString());
        }
    }


    public static void main(String[] args) {
        List<ProductInfo> productInfos = new ArrayList<>();

        ProductInfo xxx = ProductInfo.newBuilder().setProductNo("xxx").setCount(10).build();
        ProductInfo ttt = ProductInfo.newBuilder().setProductNo("ttt").setCount(100).build();
        productInfos.add(xxx);
        productInfos.add(ttt);
        showProductInfos(productInfos);
    }
}
