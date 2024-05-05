import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("pear");
        fruits.add("cantaloupe");
        System.out.println(fruits);

        String fruit = fruits.get(1);
        System.out.println(fruit);

        fruits.set(1, "peanut");
        System.out.println(fruits);

        fruits.sort(String::compareTo);
        System.out.println(fruits);

        fruits.remove(1);
        System.out.println(fruits);

        int listSize = fruits.size();
        System.out.println(listSize);

        fruits.clear();
        System.out.println(fruits);

        System.out.println("-------------------------------");

        List<Integer> nums = new ArrayList<>();
        nums.add(13);
        nums.add(79);
        nums.add(61);
        nums.add(22);
        nums.add(72);

        nums.sort(Integer::compareTo);
        System.out.println(nums);
    }
}
