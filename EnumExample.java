import java.util.Arrays;

public class EnumExample {
    enum Seasons {SPTING, SUMMER, AUTUMN, WINTER}

    public static void main(String[] args) {

        Seasons tavasz = Seasons.SPTING;
        Seasons nyar = Seasons.SUMMER;
        Seasons osz = Seasons.AUTUMN;
        Seasons tel = Seasons.WINTER;

        String ho = "February";
        Seasons result;
        switch (ho) {
            case "January", "February", "December" -> result = Seasons.WINTER;
            case "March", "April", "May" -> result = tavasz;
            case "Jun", "July", "August" -> result = nyar;
            case "Serpember", "November", "October" -> result = osz;
            default -> throw new IllegalStateException("Unexpected value: " + ho);
        }
        System.out.println(result);

        // ENUM kiíratása String formátumban
        System.out.println("\nArrays.toString() hasznalata: ");
        String evszakok = ( Arrays.toString( Arrays.stream( Seasons.values() ).toArray() ) );
        System.out.print(evszakok);

        // ENUM kiíratása ciklussal
        System.out.println("\n\nEnum kiiratas ciklussal:");
        for (Seasons season : Seasons.values()) {
            System.out.print(season + " ");
        }

        // ENUM kiíratás index alapján
        System.out.println("\n\nEnum kiiratas index alapjan:");
        for (int i = 0; i < Seasons.values().length; i++) {
            System.out.print(Seasons.values()[i] + " ");
        }
    }
}
