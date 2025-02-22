import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create the input array
        Object[] arr = {12, 9, 30, "A", "M", 99, 82, "J", "N", "B"};

        // Separate letters and numbers
        List<String> letters = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();

        // Loop through the array to separate letters and numbers
        for (Object item : arr) {
            if (item instanceof String) {
                letters.add((String) item);
            } else if (item instanceof Integer) {
                numbers.add((Integer) item);
            }
        }

        // Sort the letters alphabetically
        Collections.sort(letters);

        // Sort the numbers in ascending order
        Collections.sort(numbers);

        // Combine the sorted lists
        List<Object> sortedArr = new ArrayList<>();
        sortedArr.addAll(letters);
        sortedArr.addAll(numbers);

        // Print the sorted array
        System.out.println(sortedArr);
    }
}
