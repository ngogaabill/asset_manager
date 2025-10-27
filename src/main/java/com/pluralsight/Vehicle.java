package com.pluralsight;

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

        if (0 < getYear() && getYear() < 3) {
            total = getOriginalCost() - (getOriginalCost() * 0.03);
        } else if (4 < getYear() && getYear() < 6) {
            total = getOriginalCost() - (getOriginalCost() * 0.06);
        } else if (7 < getYear() && getYear() < 10) {
            total = getOriginalCost() - (getOriginalCost() * 0.08);
        } else if (getYear() > 10) {
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
