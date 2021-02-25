package view;

public class Fibonnaci {

	public static void main(String[] args) {

		for(int i=0; i<10;i++) {
			System.out.println(fibonaccII(i));
			
		}
		
		
	}
	
	public static long fibonaccII(int n) {
		
		if(n<2) {
			return n;
		}else  return fibonacc(n-1) + fibonacc(n-2);
		
	}
	
	public static long fibonacc(int n) {
		
		return (n<2)?n:fibonacc(n-1) + fibonacc(n-2);
		
	}//0,1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584

}
