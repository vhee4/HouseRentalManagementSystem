import BaseClass.Property;
import Database.DataBase;
import PropertyTypes.Apartment;
import PropertyTypes.Condo;
import PropertyTypes.House;
import RentalRepository.RentalRepo;
import Utility.PropertyCodeGenerator;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        PropertyCodeGenerator propertyCodeGenerator = new PropertyCodeGenerator();
        RentalRepo rentalRepo = new RentalRepo(new DataBase(4));
        Property p1 = new House(propertyCodeGenerator.getCode("h"), "fghjk", 7, 8, 60.0, false, 8.0);
        rentalRepo.addProperty(p1);
        p1.setOccupiedStatus(true);
        rentalRepo.addProperty(new House(propertyCodeGenerator.getCode("h"), "jetgsfs", 5, 6, 56.7, true, 5));
        rentalRepo.addProperty(new Condo(propertyCodeGenerator.getCode("c"), "teee", 5, 6, 56.7, true, "wateer"));
        rentalRepo.addProperty(new Apartment(propertyCodeGenerator.getCode("a"), "jetgsfs", 5, 6, 56.7, false, 55));
//        rentalRepo.deleteProperty(p1);
        rentalRepo.updateProperty(p1);
        rentalRepo.viewAllProperties();
//        rentalRepo.updateProperty(p1);
    }
}