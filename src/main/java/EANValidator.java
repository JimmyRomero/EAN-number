public class EANValidator {

    public static boolean validate(final String eanCode) {
        int sum = 0;
        int lastDigit = Integer.parseInt(eanCode.substring(eanCode.length() - 1));

        for (int i = 1; i < eanCode.length(); i++) {
            int currentIntFromString = Integer.parseInt(eanCode.substring(i - 1, i));
            sum += (i % 2 == 0) ? 3 * currentIntFromString : currentIntFromString;
        }

        sum = sum % 10 == 0 ? 0 : 10 - (sum % 10);
        return sum == lastDigit;
    }
}
