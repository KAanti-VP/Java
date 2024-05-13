import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();

        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        // overwrites the previous value
        capitalCities.put("USA", "Washington");
        System.out.println(capitalCities);

        capitalCities.replace("USA", "Washington DC");
        System.out.println(capitalCities);

        String city = capitalCities.get("England");
        System.out.println(city);

        capitalCities.remove("England");
        System.out.println(capitalCities);

        int size = capitalCities.size();
        System.out.println(size);

        boolean isEmpty = capitalCities.isEmpty();
        System.out.println(isEmpty);

        boolean isValueIn = capitalCities.containsValue("Oslo");
        boolean isKeyIn = capitalCities.containsKey("Norway");
        System.out.println(isValueIn + " " + isKeyIn);

        //
        for(Map.Entry m : capitalCities.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        System.out.println("---------------------------");
        capitalCities.forEach((key, value) -> {
            System.out.println(key + " "+ value);
        });

    }
}
