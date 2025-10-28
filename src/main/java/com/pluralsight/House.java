package com.pluralsight;

public class House extends Asset {
    private String address;
    private int condition;//1-excellent,2-good,3-fair,4-poor
    private int squareFoot;
    private int lotsSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotsSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotsSize = lotsSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getLotsSize() {
        return lotsSize;
    }

    public void setLotsSize(int lotsSize) {
        this.lotsSize = lotsSize;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    @Override
    public double getValue() {
        double total = 0.0;
        switch (getCondition()) {
            case 1:
                total = 180 * getSquareFoot() + getLotsSize() * 25;
                break;
            case 2:
                total = 130 * getSquareFoot() + getLotsSize() * 25;
                break;
            case 3:
                total = 90 * getSquareFoot() + getLotsSize() * 25;
                break;
            case 4:
                total = 80 * getSquareFoot() + getLotsSize() * 25;
                break;
        }
        return total;
    }

    @Override
    public String toString() {
        return super.toString() + "Square Foot: " + getSquareFoot() + ", Located At:" + getAddress();
    }
}
