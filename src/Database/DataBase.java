package Database;

import BaseClass.Property;

public class DataBase {
    private Property[] properties;
    private int numberOfProperties=0;

    public DataBase(int size) {
        this.properties = new Property[size];
    }

    public Property[] getPropertiesDB() {
        return properties;

    }


    public void saveChanges(Property[] properties, int numberOfProperties) {
        this.properties = properties;
        this.numberOfProperties=numberOfProperties;
    }

    public int getNumberOfProperties() {
        return numberOfProperties;
    }

}
