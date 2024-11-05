package aircraftCarrier;

public class Main {

    public static void main(String[] args) {
        Carrier c1 = new Carrier(80, 2000);
        c1.add(new F16());
        c1.add(new F16());
        c1.add(new F35());
        c1.add(new F35());
        c1.add(new F35());

        Carrier c2 = new Carrier(80, 2000);
        c2.add(new F35());
        c2.add(new F35());
        c2.add(new F16());
        c2.add(new F16());
        c2.add(new F16());

        System.out.println(c1.getStatus());
        System.out.println(c2.getStatus());

        c1.fill();
        c2.fill();

        System.out.println(c1.getStatus());
        System.out.println(c2.getStatus());

        c1.fight(c2);
        c2.fight(c1);

        System.out.println(c1.getStatus());
        System.out.println(c2.getStatus());

        c1.fill();
        c2.fill();

        System.out.println(c1.getStatus());
        System.out.println(c2.getStatus());

        try {
            c1.fill();
        } catch (NullPointerException e) {
            System.out.println("Carrier's ammo storage is empty.");
        }
    }
}
