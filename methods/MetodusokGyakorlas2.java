public class MetodusokGyakorlas2 {

    public static double negyzetTerulet(double a, double b) {
        if (a < 0 || b < 0)
            return -1;
        return a * b;
    }

    public static int harmadikSzog(int alfa, int beta) {
        if (alfa <= 0 || beta <= 0 || alfa + beta >= 180)
            return -1;
        return 180 - (alfa + beta);
    }

    public static boolean vanNagybetu(String text) {
        for (char letter: text.toCharArray()) {
            if (Character.isUpperCase(letter)) return true;
        }
        return false;
    }

    public static String fejVagyIras(int num) {
        if (num > 0)
            return "fej";
        else if (num < 0)
            return "iras";
        else
            return "elere esett";
    }

    public static void main(String[] args) {
        System.out.println(negyzetTerulet(2, 3) == 6);
        System.out.println(negyzetTerulet(0, 3) == 0);
        System.out.println(negyzetTerulet(2, 0) == 0);
        System.out.println(negyzetTerulet(-2, 3) == -1);
        System.out.println(negyzetTerulet(2, -3) == -1);
        System.out.println(negyzetTerulet(-2, -3) == -1);
        System.out.println(harmadikSzog(20, 30) == 130);
        System.out.println(harmadikSzog(30, 40) == 110);
        System.out.println(harmadikSzog(90, 90) == -1);
        System.out.println(harmadikSzog(80, 120) == -1);
        System.out.println(harmadikSzog(0, 45) == -1);
        System.out.println(harmadikSzog(45, 0) == -1);
        System.out.println(harmadikSzog(-45, 45) == -1);
        System.out.println(harmadikSzog(45, -45) == -1);
        System.out.println(vanNagybetu("Alma") == true);
        System.out.println(vanNagybetu("alma") == false);
        System.out.println(vanNagybetu("alMa") == true);
        System.out.println(vanNagybetu("123") == false);
        System.out.println(vanNagybetu("") == false);
        System.out.println(fejVagyIras(3).equals("fej"));
        System.out.println(fejVagyIras(10).equals("fej"));
        System.out.println(fejVagyIras(-3).equals("iras"));
        System.out.println(fejVagyIras(-10).equals("iras"));
        System.out.println(fejVagyIras(0).equals("elere esett"));
    }
}
