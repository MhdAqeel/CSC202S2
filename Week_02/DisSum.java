class DisSum{
	public static void main(String [] args){
		int [] arr = {1,2,3,4,5};
		
		//Recursive method
		long recursiveStartTime = System.nanoTime();
		long recursiveEndTime = System.nanoTime();
		long recursiveExecutionTime = recursiveEndTime - recursiveStartTime;
		System.out.println("recursive summation : " + reSum(arr , 0));
		System.out.println("Recursive Execution Time : " + recursiveExecutionTime);
		
		//NonRecursive method
		long StartTime = System.nanoTime();
		long EndTime = System.nanoTime();
		long ExecutionTime = EndTime - StartTime;
		System.out.println("Non - recursive summation : " + notReSum(arr));
		System.out.println("Recursive Execution Time : " + ExecutionTime);
	} 
	
	static int reSum(int[] arr , int index){
		if (index == arr.length){
			return 0;
		}
		return arr [index] + reSum(arr , index + 1);
	}
	
	static int notReSum(int [] arr){
		int sum = 0;
		for (int i = 0 ; i<arr.length ; i++){
			sum = sum + arr[i];
		}
		return sum;
	}
}