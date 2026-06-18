class Combinations{
	
	static void combination (char[] chars , String current , int index ){
		System.out.println(current);
		for(int i = index ; i<chars.length ; i++){
			combination(chars ,  current+chars[i] , i+1);
		}
	}
	
	public static void main (String [] args){
		char [] arr = {'a','b','c'};
		combination(arr , " " , 0);
	}
}