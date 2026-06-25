public class ArrayADT{
	private int[] array;
	private int size;
	
	public ArrayADT(int capacity){
		array = new int [capacity];
		size=0;
	}
	
	public void insert(int index , int element){
		if (index<0 || index>array.length-1){
			throw new IndexOutOfBoundsException("Index is out of range");
		}
		else if(size == array.length){
			System.out.println("Array is full.");
		}
		else{
			for(int i = size-1 ; i>=index ; i--){
				array[i+1] = array[i];
			}
			array[index]=element;
			size++;
		}
	}
	
	public void delete(int index){
		if (index<0 || index>array.length-1){
			throw new IndexOutOfBoundsException("Index is out of range");
		}
		else if(size == 0){
				System.out.println("Array is empty");
		}
		else{
			for(int i = index ; i<size-1 ; i++){
				array[i]=array[i+1];
			}
			array[size-1] =0;
			size--;
		}
	}
	
	public void update(int index , int element){
		if (index<0 || index>array.length-1){
			throw new IndexOutOfBoundsException("Index is out of range");
		}
		else{
			array[index]=element;
		}
	}
	
	public void get(int index){
		System.out.println(index+"th element is " + array[index]);
	}
	
	public int search(int element){
		for (int i= 0 ; i<size-1 ; i++){
			for(int j=i+1 ; j<)							//complete search
		}
	}
	
	//create a deletetion method
	
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
		//arr.printArray();
		arr.insert(1,6);
		//arr.printArray();
		arr.insert(2,5);
		//arr.printArray();
		arr.insert(1,7);
		//arr.printArray();
		arr.insert(3,2);
		arr.printArray();
		arr.delete(1);
		arr.printArray();
		/*arr.delete(1);
		arr.printArray();
		arr.delete(1);
		arr.printArray();
		arr.delete(1);
		arr.printArray();
		arr.delete(1);
		arr.printArray();
		arr.delete(1);
		arr.printArray();*/
		
		
		
		ArrayADT arr2 = new ArrayADT(5);
		arr2.insert(0,1);
		arr2.insert(1,2);
		arr2.insert(2,3);
		arr2.insert(3,4);
		//arr2.insert(4,5);
		arr2.printArray();
		arr2.update(1,10);
		arr2.printArray();
		arr2.get(2);
	}
}