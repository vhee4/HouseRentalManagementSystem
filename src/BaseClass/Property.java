package BaseClass;

//import Enums.OccupiedStatus;

public abstract  class Property {

    private String propertyCode;
    private String location;
    private int numberOfBedrooms;
    private int numberOfBathrooms;
    private double rentPerMonth;
    private boolean occupiedStatus;

    public Property(String location, int numberOfBedrooms, int numberOfBathrooms, double rentPerMonth, boolean occupiedStatus)
    {   this.location = location;
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.rentPerMonth = rentPerMonth;
        this.occupiedStatus = occupiedStatus;
    }

    public String getPropertyCode() {
        return propertyCode;
    }

    public void setPropertyCode(String propertyCode) {
        this.propertyCode = propertyCode;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public double getRentPerMonth() {
        return rentPerMonth;
    }

    public void setRentPerMonth(double rentPerMonth) {
        this.rentPerMonth = rentPerMonth;
    }

    public boolean isOccupiedStatus() {
        return occupiedStatus;
    }

    public void setOccupiedStatus(boolean occupiedStatus) {
        this.occupiedStatus = occupiedStatus;
    }

    @Override
    public String toString() {
        return
                "       propertyCode      :          " + propertyCode  +
                "\n       location          :         " + location  +
                "\n       numberOfBedrooms  :         " + numberOfBedrooms +
                "\n       numberOfBathrooms :         " + numberOfBathrooms +
                "\n       rentPerMonth      :         " + rentPerMonth +
                "\n       occupiedStatus    :         " + occupiedStatus
                ;
    }
}
