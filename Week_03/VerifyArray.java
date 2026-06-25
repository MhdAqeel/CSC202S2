class VerifyArray{
	
	static boolean checkIsItAscending(int[] arr){
		for(int i=0 ; i<arr.length-1 ; i++ ){
			if (arr[i]>arr[i+1]){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String [] args){
	int [] numbers1 = {1,2,3,4,5,6};
	int[] numbers2 = {1,1,1,1,1,1,1};
	System.out.println(checkIsItAscending(numbers1));
	System.out.println(checkIsItAscending(numbers2));
	}
}