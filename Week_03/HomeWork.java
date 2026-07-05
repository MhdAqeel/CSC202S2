
public class HomeWork {

    public static int findMinmum(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void reverseArray(int [] arr){
        int left = 0;
        int right = arr.length-1;

        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void bubbleSort(int [] arr){
            boolean swaped;
            for (int i = 0; i < arr.length - 1; i++) {
                swaped = false;
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swaped = true;
                    }
            }
            if (!swaped) {
                    break;
                }
        }
    }

    public static void selectionSort(int [] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void printArray(int [] arr){
		System.out.print("[ ");
		for (int i =0 ; i<arr.length ; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}
    public static void main(String[] args) {
        int [] arr = {4,6,8,3,7,2,9};
        int [] arr2 = {1,2,3,4,5,6,7,8};
        
        System.out.println("minimum value of this array is : " + findMinmum(arr));
        printArray(arr);
        reverseArray(arr);
        printArray(arr);
        reverseArray(arr2);
        printArray(arr2);
        bubbleSort(arr2);
        printArray(arr2);
    }
}
