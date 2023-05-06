package PropertyTypes;

import BaseClass.Property;


public class Condo extends Property {
    private String amenities;

    public Condo(String location, int numberOfBedrooms, int numberOfBathrooms, double rentPerMonth, boolean occupiedStatus, String amenities) {
        super(location, numberOfBedrooms, numberOfBathrooms, rentPerMonth, occupiedStatus);
        this.amenities = amenities;
    }

    public String getAmenities() {
        return amenities;
    }

    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }

    @Override
    public String toString() {
        return "Condo \n      {\n" +
                super.toString()+
                "\n       Amenities         :         "  + getAmenities() +
                "\n       }\n\n";
    }
}
