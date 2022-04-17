package Validadores;
public class Validator {
    public static int validateNumber(String num) {
        int resp = 0;
        boolean isNumeric = num.matches("[+-]?\\d*(\\.\\d+)?");
        if (isNumeric) {
            resp = Integer.parseInt(num);
        }
        return resp;
    }

    public static boolean validateDate(String date) {
        
        boolean resp=false ;
        boolean isDate = date.matches( "^(?:3[01]|[12][0-9]|0?[1-9])([\\-/.])(0?[1-9]|1[1-2])\\1\\d{4}$" );
        if (isDate) {
            resp = true;
        }
        return resp;
    }
    
}
