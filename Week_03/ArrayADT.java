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
	
	public int get(int index){
		return array[index];	
	}

	public int getSize(){
		return size;
	}
	
	public boolean isEmpty(){
		if(size<=0){
			return true;
		}
		else{
			return false;
		}
	}
	
	public int search(int element){
		for (int i= 0 ; i<size ; i++){
			if(array[i] == element){
				return i;
			}
		}
		return -1; // Element not found
	}
	
	public int searchRecursive(int element , int count){
		if(isEmpty()){
			System.out.println("Array is empty");	
			return -1;
		}
		
		if(count<size){
			System.out.println("Element is not found");
			return -1;
		}
		if(array[count] == element){
			return count;
		}
		return searchRecursive(element , count+1);
	}
	
	//create a deletetion method
	public void deleteValue(int value){
		int index=search(value);
		if(index<0){
			System.out.println("the given value is not in the array");
		}
		else{
			delete(index);
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
		System.out.println(arr2.search(3));
		System.out.println(arr2.search(6));


		ArrayADT arr3 = new ArrayADT(4);
		arr3.insert(0, 8);
		arr3.insert(1, 6);
		arr3.insert(2, 5);
		arr3.insert(3, 4);
		arr3.printArray();
		arr3.deleteValue(10);
		arr3.deleteValue(8);
		arr3.printArray();
		
		
		System.out.println("recursive array");
		arr3.printArray();
			
		arr3.searchRecursive(5,0);
	}
}

