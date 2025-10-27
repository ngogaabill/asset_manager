package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();
        House crib = new House("Rent", "2/27/2025", 350000, "123 alpha st", 1, 500, 230);
        assets.add(crib);
        System.out.println(crib.toString());


        Vehicle vehicle = new Vehicle("Car", "12/25/2023", 23000, "Mercedes", 2, 333000);
        assets.add(vehicle);
        System.out.println(vehicle.toString());

    }
}