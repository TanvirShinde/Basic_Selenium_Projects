package Basic;

public class Array27 {

	public static void main(String[] args) {
		
		int jk [] = { -10 , -20 , -34 , 31 , 44, 67 ,89};
		
		int positive =0;
		
		int negative=0;
		
		for (int i=0 ; i<jk.length ; i++) {
			
			if (jk [i] >0) {
				
				positive++;
			}
			
			else {
				
				negative++;
			}
		}
		
		System.out.println(positive);
		
		System.out.println(negative);
	}
}
