import java.util.Scanner;

public class SortingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("length of the array : ");
        int length = sc.nextInt();

        int [] arr = new int[length];

        for (int i=0 ; i<length ; i++){
            System.out.println("enter element "+ (i+1));
            arr[i]=sc.nextInt();
        }

        System.out.print("Input array : [ ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println("]");

        System.out.println("Enter the number to serching for : ");
        int search = sc.nextInt();
        sc.close();
        int index = serchIndex(arr, search);

        if(index == -1){
            System.out.println("number not found in the array");
        }
        else{
            System.out.println("number found at index : " + index);
        }

        bubbleSort(arr);

    }

    public static int serchIndex(int[] arr , int search){
        for(int i = 0 ; i<arr.length ; i++){
            
            if(arr[i] == search){
                return i;
            }
        }
        return -1;  //return -1 if not found

    }

    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("sorted array : [ ");
        
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println("]");
    }

}
