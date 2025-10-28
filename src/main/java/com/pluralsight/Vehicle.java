package com.pluralsight;

import java.time.LocalDate;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;


    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    @Override
    public double getValue() {
        double total = 0.0;
        LocalDate date = LocalDate.now();
        int yearToday = date.getYear();
        String[] acquiredDataParts = getDateAcquired().split("\\/");
        int yearFromAcquired = Integer.parseInt(acquiredDataParts[2]);
        int age = yearToday - yearFromAcquired;

        if (0 < age && age <= 3) {
            total = getOriginalCost() - (getOriginalCost() * (0.03 * age));
        } else if (4 <= age && age<= 6) {
            total = getOriginalCost() - (getOriginalCost() * (0.06 * age));
        } else if (7 <= age && age <= 10) {
            total = getOriginalCost() - (getOriginalCost() * (0.08 * age));
        } else if (age > 10) {
            total = getOriginalCost() - 1000;
        }

        //handle mileage depreciation unless make is toyota or honda
        if ((!getMakeModel().equalsIgnoreCase("honda") || !getMakeModel().equalsIgnoreCase("toyota")) && getOdometer() > 100000) {
            total -= (getOriginalCost() * 0.25);
        }
        return total;
    }

    @Override
    public String toString() {
        return super.toString() + ", Make: " + getMakeModel() + ", Mileaage " + getOdometer();
    }
}
