package Utility;

import BaseClass.Property;
import PropertyTypes.Apartment;
import PropertyTypes.Condo;
import PropertyTypes.House;

public class PropertyCodeGenerator {
    private int count = 1;

    public String getCode(Property property) {
        String code ="" ;
            if (property instanceof Apartment) {
                code = "APA" + formatCode()+(count++);
            } else if (property instanceof House) {
                code = "HOU" + formatCode() + (count++);
            } else if (property instanceof Condo) {
                code = "CON" + formatCode() + (count++);
                }
            return code;
    }

    private String formatCode(){
        StringBuilder counter = new StringBuilder();
        counter.append(count);
        String value = "";
        switch (counter.length()){
            case 1 -> value = "000";
            case 2 -> value = "00";
            case 3 -> value = "0";
            default -> counter.toString();
        }
        return value;
    }
}
