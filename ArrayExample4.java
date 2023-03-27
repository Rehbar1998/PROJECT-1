package day6;

public class ArrayExample4 {

	public static void main(String[] args) {
		
	
	int m[]= new int[] {1,2,345};//correct
		
		//int m[]= new int[10] {1,2,345};//compile time error
		
		//mcq  can array size be zero -- yes
		//we can print length but we cannot access any index position 
		int h[]= new int[0];
		System.out.println(h.length);  //0
		
		h[0]=100;//run time error
		System.out.println(h[0]);//java.lang.ArrayIndexOutOfBoundsException
		
		
		
		
		
		// can we declare array with negative index 
		//   no compilation error
		//but runtime error   java.lang.NegativeArraySizeException
		int y[]= new int[-2];
		
		
		
		
		
		
	}

}
