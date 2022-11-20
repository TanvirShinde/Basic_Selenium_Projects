package Basic;

public class Array123 {

	
	public static void main(String[] args) {
		
		int [] jk = {  5 ,10 , 12 , 14 , 10 ,10};
		
		int number = 10 ;
		
		int count =0 ;
		
		for ( int i=0 ; i<jk.length ; i++ ) {
			
			if ( jk [i]==number) {
				
				count++;
			}
		} 
		
		System.out.println("The count of number 10 is :" + count);
	}
}
