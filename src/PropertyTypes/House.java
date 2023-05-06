package PropertyTypes;

import BaseClass.Property;


public class House extends Property {
    private double yardSize;

    public House(String location, int numberOfBedrooms, int numberOfBathrooms, double rentPerMonth, boolean occupiedStatus, double yardSize) {
        super(location, numberOfBedrooms, numberOfBathrooms, rentPerMonth, occupiedStatus);
        this.yardSize = yardSize;
    }

    public double getYardSize() {
        return yardSize;
    }

    public void setYardSize(double yardSize) {
        this.yardSize = yardSize;
    }

    @Override
    public String toString() {
        return "House \n      {\n" +
                super.toString()+
                "\n       yardSize          :         "  + getYardSize() +
                "\n       }\n\n";
    }
}
