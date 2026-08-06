import java.util.ArrayList;

public class FrequencyOfString {
    
    public static void countFrequency(String [] arr){
        if(arr.length  == 0){
            System.err.println("Array is empty");
            return;
        }
        ArrayList <String> uniqueElement = new ArrayList<>();
        ArrayList <Integer> count = new ArrayList<>();

        for(String word : arr){
            int index = uniqueElement.indexOf(word);
            if(index == -1){
                uniqueElement.add(word);
                count.add(1);
            }
            else{
                count.set(index, count.get(index)+1);
            }
        }

        for(int i=0; i<uniqueElement.size(); i++){
            System.out.println(uniqueElement.get(i)+" -> " + count.get(i));
        }
    }
    public static void main(String[] args) {
        String[] friuts = {"apple","banana","orange","apple","apple","kiwi","banana","Strawberry"};
        countFrequency(friuts);
    }
}
