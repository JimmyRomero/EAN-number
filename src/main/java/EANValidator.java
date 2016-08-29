/**
 * Created by JimmyRomero on 8/26/2016.
 */
public class EANValidator {

    public static boolean validate(final String eanCode) {
        int sum = 0;
        int checkSum = Integer.parseInt(eanCode.substring(12));

        for (int i = 1; i < eanCode.length(); i++) {
            int currentIntFromString = Integer.parseInt(eanCode.substring(i - 1, i));
            sum += (i % 2 == 0) ? 3 * currentIntFromString : currentIntFromString;
        }

        boolean sumDivisibleByTen = sum % 10 == 0;
        return (sumDivisibleByTen && checkSum == 0) || 10 - (sum % 10) == checkSum;
    }
}
