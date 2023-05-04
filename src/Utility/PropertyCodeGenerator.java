package Utility;

import Database.DataBase;

public class PropertyCodeGenerator {
    private int count = 1;

    public String getCode(String input) {
        String code ="" ;
            char firstChar = Character.toLowerCase(input.charAt(0));
            if (firstChar == 'a') {
                code = "APA" + FormatCode()+(count++);
            } else if (firstChar == 'h') {
                code = "HOU" + FormatCode() + (count++);
            } else if (firstChar == 'c') {
                code = "CON" + FormatCode() + (count++);
                }
            else {
                System.out.println("Input must start with 'a' or 'h'!");

            }
            return code;
    }

    private String FormatCode(){
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
