package Factorial;
// factorial  calculation
public class Factorial {
	public static void main(String[] args) {
		int number = 5;
		 int factorial =1;
		 
		  for( int m =1; m<= number; m++) {
			  factorial*=m;
			  
		  }
		  System.out.println("factorial of "+ number+ "="+ factorial);
	} 
	
	

}
