package RentalRepository;

import BaseClass.Property;
import Database.DataBase;
import PropertyTypes.Apartment;
import PropertyTypes.Condo;
import PropertyTypes.House;
import Utility.PropertyCodeGenerator;

public class RentalRepo{
    private DataBase dataBase;
    PropertyCodeGenerator propertyCodeGenerator=new PropertyCodeGenerator();

    public RentalRepo(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public void addProperty(Property property){
        Property[] localDB = dataBase.getPropertiesDB();
        int numberOfProperties = dataBase.getNumberOfProperties();
        property.setPropertyCode(propertyCodeGenerator.getCode(property)); //This automatically generates the property code for each property.
        localDB[numberOfProperties] = property;
        numberOfProperties++;
        dataBase.saveChanges(localDB,numberOfProperties); //This updates the database.
    }

    public void updateProperty(Property property){
        Property[] localDB = dataBase.getPropertiesDB();
        int numberOfProperties = dataBase.getNumberOfProperties();
        for(int i = 0; i<numberOfProperties; i++) {
            if (localDB[i].getPropertyCode().equalsIgnoreCase(property.getPropertyCode())) {
                localDB[i] = property;
                dataBase.saveChanges(localDB, numberOfProperties);
                return;
            }
        }

    }

    public void deleteProperty(Property property){
        Property[] localDB = dataBase.getPropertiesDB();
        int numberOfProperties = dataBase.getNumberOfProperties();
        for(int i = 0; i<numberOfProperties; i++){
            if(localDB[i].getPropertyCode().equalsIgnoreCase(property.getPropertyCode())){
                for(int j=i; j<numberOfProperties-1;j++){
                    localDB[j] = localDB[j+1];
                }
                numberOfProperties--;
                dataBase.saveChanges(localDB, numberOfProperties);
                return;
            }
        }
    }

    public  void viewAllApartments(){
        Property[] localDB = dataBase.getPropertiesDB();
        int numberOfProperties = dataBase.getNumberOfProperties();
        for(int i = 0; i<numberOfProperties; i++){
            if(localDB[i] instanceof Apartment){
                System.out.println(localDB[i]);
            }
        }
    }

    public void viewAllHouses(){
        Property[] localDB = dataBase.getPropertiesDB();
        int numberOfProperties = dataBase.getNumberOfProperties();
        for(int i = 0; i<numberOfProperties; i++){
            if(localDB[i] instanceof House){
                System.out.println(localDB[i]);
            }
        }
    }

    public void viewAllCondos(){
        Property[] localDB = dataBase.getPropertiesDB();
        int numberOfProperties = dataBase.getNumberOfProperties();
        for(int i = 0; i<numberOfProperties; i++){
            if(localDB[i] instanceof Condo){
                System.out.println(localDB[i]);
            }
        }
    }

    public void viewAllProperties(){
        Property[] localDB = dataBase.getPropertiesDB();
        int numberOfProperties = dataBase.getNumberOfProperties();
        for(int i = 0; i<numberOfProperties; i++){
            System.out.println(localDB[i]);
        }
    }

    public  void viewAllOcccupiedProperties(){
        Property[] localDB = dataBase.getPropertiesDB();
        int numberOfProperties = dataBase.getNumberOfProperties();
        for(int i = 0; i<numberOfProperties; i++){
            if(localDB[i].isOccupiedStatus()){
                System.out.println(localDB[i]);
            }
        }
    }

    public  void viewAllUnocccupiedProperties(){
        Property[] localDB = dataBase.getPropertiesDB();
        int numberOfProperties = dataBase.getNumberOfProperties();
        for(int i = 0; i<numberOfProperties; i++){
            if(!localDB[i].isOccupiedStatus()){
                System.out.println(localDB[i]);
            }
        }
    }

    public void searchByLocation(String location) {
            Property[] localDB = dataBase.getPropertiesDB();
            int numberOfProperties = dataBase.getNumberOfProperties();
            boolean found = false;
            for (int i = 0; i < numberOfProperties; i++) {
                if (localDB[i].getLocation().equalsIgnoreCase(location)) {
                    System.out.println(localDB[i]);
                    found = true;
                }
            }
            if(!found){
                System.out.println("Property with location " + location + " not found");
            }

    }

    public void searchByPropertyCode(String propertyCode) {
        Property[] localDB = dataBase.getPropertiesDB();
        int numberOfProperties = dataBase.getNumberOfProperties();
        for (int i = 0; i < numberOfProperties; i++) {
            if (localDB[i].getPropertyCode().equalsIgnoreCase(propertyCode)){
                System.out.println(localDB[i]);
                return;
            }
        }
        System.out.println("Property with code " + propertyCode + " not found.");
    }




//    public void getOccupiedStatus(boolean status){
//        Property[] localDB = dataBase.getPropertiesDB();
//        int numberOfProperties = dataBase.getNumberOfProperties();
//        for(int i = 0; i<numberOfProperties; i++) {
//            if (localDB[i].isOccupiedStatus() == status {
//                System.out.println(localDB[i]);
//            }
//        }
//    }

}
