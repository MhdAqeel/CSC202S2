import java.util.ArrayList;

public class Q1 {
    public static ArrayList<Integer> intersection(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<list1.size(); i++){
                if (list2.contains(list1.get(i)) && !list.contains(list1.get(i))){
                    list.add(list1.get(i));
                }
        }
        return list;
    }
    
    public static void main(String [] args){
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        
        list1.add(5);
        list1.add(6);
        list1.add(4);
        list1.add(8);
        list1.add(1);
        
        list2.add(5);
        list2.add(2);
        list2.add(5);
        list2.add(9);
        list2.add(1);
		list2.add(8);
        
        System.out.println(list1);
        System.out.println(list2);
        
        System.out.println(intersection(list1, list2));
    }
}
