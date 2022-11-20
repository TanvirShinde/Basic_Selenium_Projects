package Basic;

public class Array3 {

	
	public static void main(String[] args) {
		
		
		int [] a = { 1 , 4 ,6 ,18 ,17 , 19};
		
		for ( int i=a.length-1 ; i>=0 ; i--) {
			
			
			System.out.println("   " + a[i]);
		} 
		
		
		for (   int b : a) {
			
			
			System.out.println(b);
			}
	}
}
