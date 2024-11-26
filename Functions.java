import java.util.*;

public class Functions {

    public boolean isAnagram(String txt1, String txt2) {
        char[] arr1 = txt1.toLowerCase().toCharArray();
        char[] arr2 = txt2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public int fibonacci(int num) {
        List<Integer> fib = new ArrayList<>();
        fib.add(0);
        fib.add(1);
        while(fib.size() < num + 1) {
            fib.add(fib.getLast() + fib.get(fib.size() - 2));
        }
        return fib.get(num);
    }

    public int countLetters(String txt) {
        if (txt == null || txt.trim().isEmpty()) {
            return 0;
        }
        Set<String> charSet = new HashSet<>(Arrays.asList(txt.trim().toLowerCase().split("")));
        return charSet.size();
    }
}
