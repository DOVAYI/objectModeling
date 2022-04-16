public class Validator {
    public static int validateNumber(String num) {
        int resp = 0;
        boolean isNumeric = num.matches("[+-]?\\d*(\\.\\d+)?");
        if (isNumeric) {
            resp = Integer.parseInt(num);
        }
        return resp;
    }
}
