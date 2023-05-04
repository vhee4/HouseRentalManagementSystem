package RentalRepository;

import BaseClass.Property;
import Database.DataBase;
import PropertyTypes.Apartment;
import PropertyTypes.Condo;
import PropertyTypes.House;

public class RentalRepo{
    private DataBase dataBase;

    public RentalRepo(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public void addProperty(Property property){
        Property[] localDB = dataBase.getPropertiesDB();
        int numberOfProperties = dataBase.getNumberOfProperties();
        localDB[numberOfProperties] = property;
        numberOfProperties++;
        dataBase.setPropertiesDB(localDB,numberOfProperties);
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

    public  void viewAllHouses(){
        Property[] localDB = dataBase.getPropertiesDB();
        int numberOfProperties = dataBase.getNumberOfProperties();
        for(int i = 0; i<numberOfProperties; i++){
            if(localDB[i] instanceof House){
                System.out.println(localDB[i]);
            }
        }
    }

    public  void viewAllCondos(){
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

    public  void viewByLocation(String location){
        Property[] localDB = dataBase.getPropertiesDB();
        int numberOfProperties = dataBase.getNumberOfProperties();
        for(int i = 0; i<numberOfProperties; i++){
            if(localDB[i].getLocation().equals(location)){
                System.out.println(localDB[i]);
            }
        }
    }

    public  void viewByPropertyCode(String propertyCode){
        Property[] localDB = dataBase.getPropertiesDB();
        int numberOfProperties = dataBase.getNumberOfProperties();
        for(int i = 0; i<numberOfProperties; i++){
            if(localDB[i].getPropertyCode().equals(propertyCode)){
                System.out.println(localDB[i]);
            }
        }
    }

    public void updateProperty(Property property){
        Property[] localDB = dataBase.getPropertiesDB();
        int numberOfProperties = dataBase.getNumberOfProperties();
        for(int i = 0; i<numberOfProperties; i++) {
            if (localDB[i].getPropertyCode().equals(property.getPropertyCode())) {
                localDB[i] = property;
                return;
            }
        }

    }

    public void deleteProperty(Property property){
        Property[] localDB = dataBase.getPropertiesDB();
        int numberOfProperties = dataBase.getNumberOfProperties();
        for(int i = 0; i<numberOfProperties; i++){
            if(localDB[i].getPropertyCode().equals(property.getPropertyCode())){
                for(int j=i; j<numberOfProperties-1;j++){
                    localDB[j] = localDB[j+1];
                }
                numberOfProperties--;
                dataBase.setPropertiesDB(localDB, numberOfProperties);
                return;
            }
        }
    }


}
