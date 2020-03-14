class CreditCard {
    public static void main(String[] args) {
        System.out.println(maskify("A234-AAAA-BBBB-ABCD"));
    }

    private static final int Size = 6;

    //check last four chracters are digits if yes return true else return false
    public static boolean clFourDgt(String s) {
        int all = 0;
        for (int i = 0; i < s.length(); i++) {

            if (Character.isDigit(s.charAt(i))) {
                all++;
            }
        }
        if (all == s.length()) {
            return true;
        } else {
            return false;
        }
    }

    public static String maskify(String creditCardNumber) {


        // handle empty strings
        if (creditCardNumber == null || creditCardNumber.isEmpty()) {
            return "";
        } else if (creditCardNumber.length() < Size) {
            return creditCardNumber;
        }

        if (creditCardNumber.matches(".*\\d.*")) {
            String lastFour = creditCardNumber.substring(creditCardNumber.length() - 4);
            //check first is digit and last 4 are digit

            if (Character.isDigit(creditCardNumber.charAt(0))) {

                String firstString = creditCardNumber.substring(0, 1);

                boolean x = clFourDgt(lastFour);
                if (x) {
                    String restString = creditCardNumber.substring(1, creditCardNumber.length() - 4);

                    restString = restString.replaceAll("[0-9]", "#");
                    creditCardNumber = firstString + restString + lastFour;

                    return creditCardNumber;
                } else {
                    String restString = creditCardNumber.substring(1, creditCardNumber.length());

                    restString = restString.replaceAll("[0-9]", "#");
                    creditCardNumber = firstString + restString;

                    return creditCardNumber;
                }
            } else {

                if (clFourDgt(lastFour)) {
                    String restString = creditCardNumber.substring(0, creditCardNumber.length() - 4);
                    restString = restString.replaceAll("[0-9]", "#");
                    creditCardNumber = restString + lastFour;

                    return creditCardNumber;
                } else {
                    return creditCardNumber.replaceAll("[0-9]", "#");
                }
            }
        }
        return creditCardNumber;
    }
}
