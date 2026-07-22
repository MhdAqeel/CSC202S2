import java.util.*;
public class KthLargest {

    public static int findKthLargestElement(ArrayList<Integer> list , int k){
        if(list.isEmpty() || k>list.size()){
            return -1;
        }
        else{
            for (int i = 1; i < list.size(); i++) {
                int key = list.get(i);
                int j = i - 1;

                while (j >= 0 && list.get(j) < key) {
                    list.set(j + 1, list.get(j));
                    j--;
                }
                list.set(j + 1, key);
            }
            return list.get(k-1);
        }


    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of k");
        int k = sc.nextInt();
        sc.close();

        ArrayList <Integer> list = new ArrayList<>();
        list.add(3);
        list.add(8);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(2);
        list.add(4);

        System.out.println("Kth largest element = " + findKthLargestElement(list, k));
    }
}
