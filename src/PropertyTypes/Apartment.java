package PropertyTypes;

import BaseClass.Property;
import Enums.OccupiedStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Apartment extends Property {
private int floorNumber;

    public Apartment(String propertyCode, String location, int numberOfBedrooms, int numberOfBathrooms, double rentPerMonth, boolean occupiedStatus, int floorNumber) {
        super(propertyCode, location, numberOfBedrooms, numberOfBathrooms, rentPerMonth, occupiedStatus);
        this.floorNumber = floorNumber;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "propertyCode : " + super.getPropertyCode() +
                "\nlocation : " + super.getLocation() + '\'' +
                "\nnumberOfBedrooms : " + super.getNumberOfBedrooms() +
                "\nnumberOfBathrooms : " + super.getNumberOfBathrooms() +
                "\nrentPerMonth : " + super.getRentPerMonth()+
                "\nfloorNumber : " + getFloorNumber() +
                "\noccupiedStatus : " + super.isOccupiedStatus() +
                "}\n\n";
    }
}
