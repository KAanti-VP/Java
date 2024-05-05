import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("pear");
        fruits.add(1, "cantaloupe");
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
        nums.add(8);
        System.out.println(nums);

        // copy of List
        List<Integer> list = new ArrayList<>(nums);

        list.sort(Integer::compareTo);
        System.out.println("nums: " + nums);
        System.out.println("list: " + list);

        nums.remove(new Integer(61));
        System.out.println(nums);

        System.out.println(nums.subList(1, 4));
    }
}
