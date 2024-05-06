import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        String car = cars.get(2);
        System.out.println(car);

        car = cars.getFirst();
        System.out.println(car);

        car = cars.peek();
        System.out.println(car);

        car = cars.getLast();
        System.out.println(car);

        cars.addFirst("Skoda");
        System.out.println(cars);

        cars.addLast("Audi");
        System.out.println(cars);

        cars.removeFirst();
        System.out.println(cars);

        cars.removeLast();
        System.out.println(cars);

        cars.remove("BMW");
        System.out.println(cars);

        cars.remove(0);
        System.out.println(cars);

        boolean answer = cars.contains("Volvo");
        System.out.println(answer);
    }
}
