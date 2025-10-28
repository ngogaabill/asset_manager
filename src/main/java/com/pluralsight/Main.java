package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();
        House crib = new House("Rental House", "2/27/2025", 350000, "123 alpha st", 1, 500, 230);
        assets.add(crib);

        House vacation = new House("Vacation House", "2/03/2025", 100000, "123 cal Rd", 1, 700, 500);
        assets.add(vacation);

        Vehicle vehicle1 = new Vehicle("Shema's Car", "12/25/2023", 23000, "Mercedes", 2, 23365);
        assets.add(vehicle1);

        Vehicle vehicle2 = new Vehicle("Family Car", "12/05/2019", 31000, "Toyota", 8, 33000);
        assets.add(vehicle2);

        for (int i = 0; i < assets.size(); i++) {
            if (assets.get(i) instanceof House) {
                System.out.printf("InstanceOf->House ,Description: %s Date Acquired: %s Amount Paid %.2f Value: %.2f\n", assets.get(i).getDescription(), assets.get(i).getDateAcquired(),assets.get(i).getOriginalCost(),assets.get(i).getValue());
            } else if (assets.get(i) instanceof Vehicle) {
                System.out.printf("InstanceOf->Vehicle ,Description: %s Date Acquired: %s Amount Paid %.2f Value: %.2f\n", assets.get(i).getDescription(), assets.get(i).getDateAcquired(),assets.get(i).getOriginalCost(),assets.get(i).getValue());
            }
        }
    }
}