package PropertyReport;

import BaseClass.Property;
import Database.DataBase;
import PropertyTypes.Apartment;
import PropertyTypes.Condo;
import PropertyTypes.House;

public class PropertyReport {
    private DataBase dataBase;

    public PropertyReport(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public void totalNumberOfAllProperties(){
        Property[] localDB = dataBase.getPropertiesDB();
        int numberOfProperties = dataBase.getNumberOfProperties();
        System.out.println("Total number of properties : " + numberOfProperties);
    }

    public void totalNumberOf(String propertyType){
        Property[] localDB = dataBase.getPropertiesDB();
        int numberOfProperties = dataBase.getNumberOfProperties();
        int count = 0;
        switch (propertyType.toLowerCase()) {

            case "apartment" -> {
                for (int i = 0; i < numberOfProperties; i++) {
                    if (localDB[i] instanceof Apartment) {
                        count++;
                    }
                }
                System.out.println("Total number of Apartments :  " + count);
            }

            case "house" -> {
                for (int i = 0; i < numberOfProperties; i++) {
                    if (localDB[i] instanceof House) {
                        count++;
                    }
                }
                System.out.println("Total number of Houses :  " + count);
            }

            case "condo" -> {
                for (int i = 0; i < numberOfProperties; i++) {
                    if (localDB[i] instanceof Condo) {
                        count++;
                    }
                }
                System.out.println("Total number of Condos :  " + count);
            }
            default -> System.err.println("Pass in either house, condo or apartment as a parameter");
        }
    }

    public void totalNumberOfBedrooms(String propertyType){
        Property[] localDB = dataBase.getPropertiesDB();
        int numberOfProperties = dataBase.getNumberOfProperties();
        int count=0;
        switch (propertyType.toLowerCase()){

            case "apartment" -> {
                for (int i = 0; i < numberOfProperties; i++) {
                    if (localDB[i] instanceof Apartment) {
                        int bedroom = localDB[i].getNumberOfBedrooms();
                        count += bedroom;
                    }
                }
                System.out.println("Total number of Bedrooms in Apartments: " + count);
            }

            case "house" -> {
                for(int i = 0; i<numberOfProperties; i++){
                    if(localDB[i] instanceof  House){
                        int bedroom = localDB[i].getNumberOfBedrooms();
                        count += bedroom;
                    }
                }
                System.out.println("Total number of Bedrooms in Houses: " + count);
            }

            case "condo" -> {
                for (int i = 0; i < numberOfProperties; i++) {
                    if (localDB[i] instanceof Condo) {
                        int bedroom = localDB[i].getNumberOfBedrooms();
                        count += bedroom;
                    }
                }
                System.out.println("Total number of Bedrooms in Condos: " + count);

            }
            default -> System.err.println("Pass in either house, condo or apartment as a parameter");
        }
    }

    public void totalNumberOfBathrooms(String propertyType){
        Property[] localDB = dataBase.getPropertiesDB();
        int numberOfProperties = dataBase.getNumberOfProperties();
        int count=0;
        switch (propertyType.toLowerCase()){
            case "apartment" -> {
                for (int i = 0; i < numberOfProperties; i++) {
                    if (localDB[i] instanceof Apartment) {
                        int bathroom = localDB[i].getNumberOfBathrooms();
                        count += bathroom;
                    }
                }
                System.out.println("Total number of Bathrooms in Apartments: " + count);
            }

            case "house" -> {
                for(int i = 0; i<numberOfProperties; i++){
                    if(localDB[i] instanceof  House){
                        int bathroom = localDB[i].getNumberOfBedrooms();
                        count += bathroom;
                    }
                }
                System.out.println("Total number of Bathrooms in Houses: " + count);
            }

            case "condo" -> {
                for (int i = 0; i < numberOfProperties; i++) {
                    if (localDB[i] instanceof Condo) {
                        int bathroom = localDB[i].getNumberOfBedrooms();
                        count += bathroom;
                    }
                }
                System.out.println("Total number of Bathrooms in Condos: " + count);
            }
            default -> System.err.println("Pass in either house, condo or apartment as a parameter");
        }
    }

    public void totalNumberOfOccupied(String propertyType){
        Property[] localDB = dataBase.getPropertiesDB();
        int numberOfProperties = dataBase.getNumberOfProperties();
        int count=0;
        switch (propertyType.toLowerCase()){

            case "apartment" -> {
                for (int i = 0; i < numberOfProperties; i++) {
                    if (localDB[i] instanceof Apartment && localDB[i].isOccupiedStatus()) {
                        count++;
                    }
                }
                System.out.println("Total number of Occupied Apartments: " + count);
            }

            case "house" -> {
                for(int i = 0; i<numberOfProperties; i++){
                    if(localDB[i] instanceof  House && localDB[i].isOccupiedStatus()){
                        count++;
                    }
                }
                System.out.println("Total number of Occupied Houses: " + count);
            }

            case "condo" -> {
                for (int i = 0; i < numberOfProperties; i++) {
                    if (localDB[i] instanceof Condo && localDB[i].isOccupiedStatus()) {
                        count++;
                    }
                }
                System.out.println("Total number of Occupied Condos: " + count);
            }
            default -> System.err.println("Pass in either house, condo or apartment as a parameter");
        }
    }

    public void totalNumberOfUnoccupied(String propertyType){
        Property[] localDB = dataBase.getPropertiesDB();
        int numberOfProperties = dataBase.getNumberOfProperties();
        int count=0;
        switch (propertyType.toLowerCase()){
            case "apartment" -> {
                for (int i = 0; i < numberOfProperties; i++) {
                    if (localDB[i] instanceof Apartment && !(localDB[i].isOccupiedStatus())) {
                        count++;
                    }
                }
                System.out.println("Total number of Unoccupied Apartments: " + count);
            }

            case "house" -> {
                for(int i = 0; i<numberOfProperties; i++){
                    if(localDB[i] instanceof  House && !(localDB[i].isOccupiedStatus())){
                        count++;
                    }
                }
                System.out.println("Total number of Unoccupied Houses: " + count);
            }

            case "condo" -> {
                for (int i = 0; i < numberOfProperties; i++) {
                    if (localDB[i] instanceof Condo && !(localDB[i].isOccupiedStatus())) {
                        count++;
                    }
                }
                System.out.println("Total number of Unoccupied Condos: " + count);
            }
            default -> System.err.println("Pass in either house, condo or apartment as a parameter");
        }
    }

    public void totalRentalIncome(String propertyType){
        Property[] localDB = dataBase.getPropertiesDB();
        int numberOfProperties = dataBase.getNumberOfProperties();
        double income = 0;
        switch (propertyType.toLowerCase()){
            case "apartment" -> {
                for(int i = 0; i< numberOfProperties; i++){
                    if(localDB[i] instanceof Apartment && localDB[i].isOccupiedStatus()){
                        income += localDB[i].getRentPerMonth();
                    }
                }
                System.out.println("Total rental income for apartments: " + income);
            }

            case "house" -> {
                for(int i = 0; i< numberOfProperties; i++){
                    if(localDB[i] instanceof House && localDB[i].isOccupiedStatus()){
                        income += localDB[i].getRentPerMonth();
                    }
                }
                System.out.println("Total rental income for houses: " + income);
            }

            case "condo" -> {
                for(int i = 0; i< numberOfProperties; i++){
                    if(localDB[i] instanceof Condo && localDB[i].isOccupiedStatus()){
                        income += localDB[i].getRentPerMonth();
                    }
                }
                System.out.println("Total rental income for condos: " + income);
            }
            default -> System.err.println("Pass in either house, condo or apartment as a parameter");
        }
    }
}
