import java.util.Arrays;

public class PartyArraysAndDividable {

    public static void main(String[] args) {
        System.out.println("PartyValidation");
        System.out.println(partyValidation(11, 11).equals("The party is excellent!"));
        System.out.println(partyValidation(11, 12).equals("Quite a cool party!"));
        System.out.println(partyValidation(9, 9).equals("Average party..."));
        System.out.println(partyValidation(9, 10).equals("Average party..."));
        System.out.println(partyValidation(0, 25).equals("Sausage party"));
        System.out.println("Arrays");
        System.out.println(Arrays.toString(add(new int[] {1,2,0,4,5}, 3)).equals("[1, 2, 3, 4, 5]"));
        System.out.println(Arrays.toString(add(new int[] {1,0,0,4,5}, 3)).equals("[1, 3, 0, 4, 5]"));
        System.out.println(Arrays.toString(add(new int[] {}, 3)).equals("[3]"));
        System.out.println(Arrays.toString(add(new int[] {1,2,3,4,5}, 6)).equals("[1, 2, 3, 4, 5, 6]"));
        System.out.println(Arrays.toString(addToIndex(new int[] {1,2,3,4,5}, 0, 6)).equals("[6, 2, 3, 4, 5]"));
        System.out.println(Arrays.toString(addToIndex(new int[] {1,2,3,4,5}, 2, 6)).equals("[1, 2, 6, 4, 5]"));
        System.out.println(Arrays.toString(addToIndex(new int[] {1,2,3,4,5}, 6, 2)).equals("[1, 2, 3, 4, 5, 2]"));
        System.out.println(Arrays.toString(remove(new int[] {1,2,3,2,1}, 5)).equals("[1, 2, 3, 2, 1]"));
        System.out.println(Arrays.toString(remove(new int[] {1,2,3,2,1}, 2)).equals("[1, 3, 2, 1]"));
        System.out.println(Arrays.toString(remove(new int[] {1,2,3,2,1}, 3)).equals("[1, 2, 2, 1]"));
        System.out.println(Arrays.toString(removeByIndex(new int[] {1,2,3,4,5}, 5)).equals("[1, 2, 3, 4, 5]"));
        System.out.println(Arrays.toString(removeByIndex(new int[] {1,2,3,4,5}, 3)).equals("[1, 2, 3, 5]"));
        System.out.println(Arrays.toString(removeByIndex(new int[] {}, 5)).equals("[]"));
        System.out.println("Dividable");
        System.out.println(dividable(24, 4, 5) == 4);
        System.out.println(dividable(30, 4, 5) == 5);
        System.out.println(dividable(40, 4, 5) == 20);
        System.out.println(dividable(54, 4, 5) == -1);
    }

    public static String partyValidation(int girls, int boys) {
        String result = "";
        if (girls > 0) {
            if (girls + boys >= 20) {
                result = (girls == boys) ? "The party is excellent!" : "Quite a cool party!";
            } else {
                result = "Average party...";
            }
        } else {
            result = "Sausage party";
        }
        return result;
    }

    public static int dividable(int num, int fizz, int buzz) {
        int result = -1;
        if (num % fizz == 0) result = fizz;
        if (num % buzz == 0)
            result = (result == -1) ? buzz : fizz * buzz;
        return result;
    }

    public static int[] add(int[] arr, int num) {
        boolean isAdded = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = num;
                isAdded = true;
                break;
            }
        }
        if (!isAdded) {
            int[] result = Arrays.copyOf(arr, arr.length + 1);
            result[arr.length] = num;
            arr = result;
        }
        return arr;
    }

    public static int[] addToIndex(int[] arr, int index, int num) {
        if (arr.length > index)
            arr[index] = num;
        else {
            int[] result = Arrays.copyOf(arr, arr.length + 1);
            result[arr.length] = num;
            arr = result;
        }
        return arr;
    }

    public static int[] remove(int[] arr, int num) {
        int[] result = arr;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                result = removeByIndex(arr, i);
                break;
            }
        }
        return result;
    }

    public static int[] removeByIndex(int[] arr, int index)  {
        int[] result;
        if (arr.length > index) {
            result = new int[arr.length - 1];
            int j = 0;
            for (int i = 0; i < arr.length ; i++) {
                if (i == index) continue;
                result[j++] = arr[i];
            }
        } else {
            result = arr;
        }
        return result;
    }
}
