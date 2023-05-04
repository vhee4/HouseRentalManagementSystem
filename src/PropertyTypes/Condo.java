package PropertyTypes;

import BaseClass.Property;
import Enums.OccupiedStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Condo extends Property {
    private String amenities;

    public Condo(String propertyCode, String location, int numberOfBedrooms, int numberOfBathrooms, double rentPerMonth, boolean occupiedStatus, String amenities) {
        super(propertyCode, location, numberOfBedrooms, numberOfBathrooms, rentPerMonth, occupiedStatus);
        this.amenities = amenities;
    }

    @Override
    public String toString() {
        return "Condo{" +
                "propertyCode : " + super.getPropertyCode() +
                "\nlocation : " + super.getLocation() + '\'' +
                "\nnumberOfBedrooms : " + super.getNumberOfBedrooms() +
                "\nnumberOfBathrooms : " + super.getNumberOfBathrooms() +
                "\nrentPerMonth : " + super.getRentPerMonth()+
                "\nAmenities : " + getAmenities() +
                "\noccupiedStatus : " + super.isOccupiedStatus() +
                "}\n\n";
    }
}
