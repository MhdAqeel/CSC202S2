public class ArrayADT{
	private int[] array;
	private int size;
	
	public ArrayADT(int capacity){
		array = new int [capacity];
		size=0;
	}
	
	public void insert(int position , int element){
		if (position<0 || position>array.length-1){
			throw new IndexOutOfBoundsException("Index is out of range");
		}
		else if(size == array.length){
			System.out.println("Array is full.");
		}
		else{
			for(int i = size-1 ; i>=position ; i--){
				array[i+1] = array[i];
			}
			array[position]=element;
			size++;
		}
	}
	
	public void printArray(){
		System.out.print("[ ");
		for (int i =0 ; i<size ; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println("]");
	}
	
	public static void main(String [] args){
		ArrayADT arr = new ArrayADT(5);
		arr.insert(0,1);
		arr.printArray();
		arr.insert(1,6);
		arr.printArray();
		arr.insert(2,5);
		arr.printArray();
		arr.insert(1,7);
		arr.printArray();
		arr.insert(3,2);
		arr.printArray();
		
		
		ArrayADT arr2 = new ArrayADT(5);
		arr2.insert(0,1);
		arr2.insert(2,3);
		arr2.insert(3,4);
		arr2.insert(4,5);
		arr2.printArray();
		
	}
}