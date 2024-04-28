package com.ncirl.util;
import com.ncirl.streaming.storeservice.ProductInfo;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StoreDB {

    private static String filePath = "store.csv";

    public static List<ProductInfo> queryByProductNo(String productNo) {
        List<ProductInfo> productInfos = new ArrayList<>();

        Map<String, ProductInfo> stringProductInfoMap = loadCSVMap();
        if(stringProductInfoMap.containsKey(productNo)){
            ProductInfo productInfo = stringProductInfoMap.get(productNo);
            productInfos.add(productInfo);
        }
        return productInfos;
    }

    public static List<ProductInfo> loadCSV() {
        List<ProductInfo> productInfos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                Integer count = Integer.valueOf(parts[1].trim());
                ProductInfo productInfo = ProductInfo.newBuilder().setProductNo(parts[0].trim()).setCount(count).build();
                productInfos.add(productInfo);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return productInfos;
    }

    public static List<ProductInfo> loadCSV(String filePath) {
        List<ProductInfo> productInfos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                Integer count = Integer.valueOf(parts[1].trim());
                ProductInfo productInfo = ProductInfo.newBuilder().setProductNo(parts[0].trim()).setCount(count).build();
                productInfos.add(productInfo);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return productInfos;
    }

    public static Map<String, ProductInfo> loadCSVMap() {
        Map<String, ProductInfo> mappiing = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                Integer count = Integer.valueOf(parts[1].trim());
                String productNo = parts[0].trim();
                ProductInfo productInfo = ProductInfo.newBuilder().setProductNo(productNo).setCount(count).build();
                mappiing.put(productNo, productInfo);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return mappiing;
    }


    public static void updateCSV(List<ProductInfo> productInfos) {
        Map<String, ProductInfo> productInfoMap = loadCSVMap();
        for (ProductInfo newProduct : productInfos) {
            productInfoMap.put(newProduct.getProductNo(), newProduct);
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write( "productNo,count\n");
            for (Map.Entry<String, ProductInfo> entry : productInfoMap.entrySet()) {
                ProductInfo productInfo = entry.getValue();
                bw.write(productInfo.getProductNo()+ "," + productInfo.getCount() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addToCsv(String fileName , ProductInfo newProduct) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
            bw.write(newProduct.getProductNo() + "," + newProduct.getCount() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void newCsv(String fileName) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write("productNo,count\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        //just show how to use the methods
        List<ProductInfo> products = loadCSV();
        for (ProductInfo product : products) {
            System.out.println("Product No: " + product.getProductNo() + ", Count: " + product.getCount());
        }

        ProductInfo product1 = ProductInfo.newBuilder().setProductNo("ttt").setCount(100).build();
        ProductInfo product2 = ProductInfo.newBuilder().setProductNo("DEF456").setCount(100).build();

        ArrayList<ProductInfo> productInfos = new ArrayList<>();
        productInfos.add(product1);
        productInfos.add(product2);
        updateCSV(productInfos);

    }
}


