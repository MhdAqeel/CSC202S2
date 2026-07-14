public class CountOccurence {

    public static void findCount(ArrayADT numbers){
        int []count = new int[numbers.getSize()];
        boolean [] conunted = new boolean[numbers.getSize()];
        for(int i = 0; i < numbers.getSize(); i++){
            if(conunted[i] == true){
                continue;
            }
            int c = 1;
            for(int j = i + 1; j < numbers.getSize(); j++){
                if(numbers.get(i) == numbers.get(j)){
                    c++;
                    conunted[j] = true;
                }
            }
            count[i] = c;
        }
        for(int i = 0; i < numbers.getSize(); i++){
            if(conunted[i] == false){
                System.out.print(numbers.get(i) + " -> " + count[i] + " , ");
            }
        }
    }
    public static void main(String[] args) {
        ArrayADT numbers = new ArrayADT(10);
        numbers.insert(0, 5);
        numbers.insert(1, 2);
        numbers.insert(2, 3);
        numbers.insert(3, 1);
        numbers.insert(4, 5);
        numbers.insert(5, 4);
        numbers.insert(6, 6);
        numbers.insert(7, 8);
        numbers.insert(8, 5);
        numbers.insert(9, 1);
        numbers.traverse();
        findCount(numbers);
    }
}
