package PropertyTypes;

import BaseClass.Property;

public class Apartment extends Property {
private int floorNumber;

    public Apartment(String location, int numberOfBedrooms, int numberOfBathrooms, double rentPerMonth, boolean occupiedStatus, int floorNumber) {
        super(location, numberOfBedrooms, numberOfBathrooms, rentPerMonth, occupiedStatus);
        this.floorNumber = floorNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String toString() {
        return "Apartment \n      {\n" +
                super.toString()+
                "\n       floorNumber       :         "  + getFloorNumber() +
                "\n       }\n\n";
    }
}
