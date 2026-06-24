import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Program 3: Count the Frequency of Each Element in an Integer Array
 */
public class FrequencyCount {

    public static Map<Integer, Integer> countFrequency(int[] arr) {
        // LinkedHashMap preserves insertion order for nicer output
        Map<Integer, Integer> frequencyMap = new LinkedHashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        return frequencyMap;
    }

    public static void main(String[] args) {
        int[] numbers = {4, 2, 7, 2, 4, 1, 7, 7, 4, 4, 2, 9};

        System.out.print("Array: ");
        for (int n : numbers) System.out.print(n + " ");
        System.out.println();
        System.out.println();

        Map<Integer, Integer> frequency = countFrequency(numbers);

        System.out.println("Element | Frequency");
        System.out.println("-----------------");
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            System.out.printf("   %-4d |    %d%n", entry.getKey(), entry.getValue());
        }
    }
}
