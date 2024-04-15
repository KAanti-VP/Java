public class MetodusokGyakorlas {

    public  static String szogElnevezes(double angle) {
        String result = "";
        if (angle < 0)
            result = "negatín szög";
        else if (angle == 0)
            result = "nullszög";
        else if (angle > 0 && angle < 90)
            result = "hegyesszög";
        else if (angle == 90)
            result = "derékszög";
        else if (angle > 90 && angle < 180)
            result = "tompaszög";
        else if (angle == 180)
            result = "egyenesszög";
        else if (angle > 180 && angle < 360)
            result = "homorúszög";
        else if (angle == 360)
            result = "teljesszög";
        else
            result = "nagyobb, mint a teljes szög";
        return result;
    }

    public static boolean hasEightTheSqrt(int num) {
        String result = "" + Math.sqrt(num);
        return result.contains("8");
    }

    public static boolean isValidPassword(String password) {
        int lowerLetterCount = 0;
        int upperLetterCount = 0;
        int numberCount = 0;
        int specialCharacterCount = 0;
        for (char x: password.toCharArray()) {
            if (Character.isLowerCase(x)) lowerLetterCount++;
            if (Character.isUpperCase(x)) upperLetterCount++;
            if (Character.isDigit(x)) numberCount++;
            if (".-*#@!".contains("" + x)) specialCharacterCount++;
        }
        return lowerLetterCount > 1 && upperLetterCount > 1 && numberCount > 0 && specialCharacterCount > 0;
    }

    public static String bodyMassIndexResult(double weight, double height) {
        double bmi = weight / (height * height);
        String result = "";
        if (bmi < 18.5) result = "Alacsony testsúly alatti kategória";
        if (bmi >= 18.5 && bmi < 25) result = "Normál testsúlyú kategória";
        if (bmi >= 25 && bmi < 30) result = "Túlsúlyos kategória";
        if (bmi >= 30 && bmi < 35) result = "Elhízás (I. fokú) kategória";
        if (bmi >= 35 && bmi < 40) result = "Elhízás (II. fokú) kategória";
        if (bmi >= 40) result = "Súlyos elhízás (III. fokú) kategória";
        return result;
    }
}
