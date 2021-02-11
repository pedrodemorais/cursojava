package view;

public class ExemploForEach {

	public static void main(String[] args) {
		String[] vect = new String[] {"Pedro","Duda","Biel"} ;
		
		for(int i=0;i<vect.length;i++) {
			System.out.println(vect[i]);
		}
		
		for(String obj: vect) {
			System.out.println(obj);
			
		}
	}

}
