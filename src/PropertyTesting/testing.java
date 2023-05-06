package PropertyTesting;

import BaseClass.Property;
import Database.DataBase;
import PropertyReport.PropertyReport;
import PropertyTypes.Apartment;
import PropertyTypes.Condo;
import PropertyTypes.House;
import RentalRepository.RentalRepo;

public class testing {


    public static void main(String[] args) {

        //CREATING DATABASE
        DataBase dataBase = new DataBase(99);

        //BOTH RENTAL REPO AND PROPERTY REPORT SHARE THE SAME DATABASE
        RentalRepo rentalRepo = new RentalRepo(dataBase);//Rental repo contains all the CRUD methods
        PropertyReport propertyReport = new PropertyReport(dataBase);//PROPERTY REPORT CONTAINS ALL REPORTS ON PROPERTY AND PROPERTY TYPES

        Property H1 = new House("Abuja", 7, 8, 60.0, false, 8.0);
        Property H2 = new House("Abuja", 4, 6, 23.0, true, 8.0);
        Property H3 = new House("Imo", 5, 5, 60.0, false, 8.0);
        Property H4 = new House("Imo", 3, 3, 60.0, false, 8.0);
        Property C5 = new Condo("Lagos", 2, 1, 60.0, true, "water");
        Property C6 = new Condo("Lagos", 8, 4, 60.0, true, "Electricity");
        Property C7 = new Condo("Kaduna", 11, 6, 60.0, false, "food");
        Property C8 = new Condo("Kaduna", 5, 3, 60.0, false, "water");
        Property A9 = new Apartment("Kano", 3, 7, 60.0, true, 3);
        Property A10= new Apartment("Kano", 4, 9, 60.0, false, 4);
        Property A11= new Apartment("Kebbi", 5, 2, 60.0, true, 4);
        Property A12= new Apartment("Calabar", 3, 3, 60.0, false, 8);

        rentalRepo.addProperty(H1);
        rentalRepo.addProperty(H2);
        rentalRepo.addProperty(H3);
        rentalRepo.addProperty(H4);
        rentalRepo.addProperty(C5);
        rentalRepo.addProperty(C6);
        rentalRepo.addProperty(C7);
        rentalRepo.addProperty(C8);
        rentalRepo.addProperty(A9);
        rentalRepo.addProperty(A10);
        rentalRepo.addProperty(A11);
        rentalRepo.addProperty(A12);

        rentalRepo.viewAllProperties();
        propertyReport.totalNumberOfAllProperties();
        propertyReport.totalNumberOf("house");
        propertyReport.totalNumberOf("apartment");
        propertyReport.totalNumberOf("condo");
        propertyReport.totalRentalIncome("house");
        propertyReport.totalRentalIncome("apartment");
        propertyReport.totalRentalIncome("condo");


    }
}