import java.util.HashMap;
public class CountFrequency {
    public static void main(String[] args) {
        ArrayADT numbers = new ArrayADT(8);
        numbers.insert(0, 6);
        numbers.insert(1, 7);
        numbers.insert(2, 4);
        numbers.insert(3, 2);
        numbers.insert(4, 8);
        numbers.insert(5, 4);
        numbers.insert(6, 4);
        numbers.insert(7, 2);

        numbers.printArray();

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for(int i = 0 ; i<numbers.getSize() ; i++){
            if(frequencyMap.containsKey(numbers.get(i))){
                frequencyMap.put(numbers.get(i), frequencyMap.get(numbers.get(i)) + 1);
            }
            else{
                frequencyMap.put(numbers.get(i), 1);
            }
        }
        System.out.println(frequencyMap);
    }
}
