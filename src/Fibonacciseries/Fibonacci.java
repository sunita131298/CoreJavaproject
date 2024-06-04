package Fibonacciseries;

public class Fibonacci {
	public static void main(String[] args) {
		
		int terms =10;
		int firstTerm = 0, secondTerm = 1;
		System.out.println("fibonacci series.s");
		
		for(int i=1 ; i <=terms; ++i) {
			System.out.println(firstTerm+ ",");
			int nextterm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextterm ;
			 
		}
		
	}

}
