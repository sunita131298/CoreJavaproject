package palindromenum;
//343,212,222,1234321
 //is same number to read back word and forword
public class palindro {
	
	public static void main(String[] args) {
		
	int n=121;
	int temp=n;
	int rev=0;
	
	while(n>0) {
		int r=n%10;
		n=n/10;
		rev=(rev*10)+r;
	}if(temp== rev ) {
		System.out.println(temp+"=is palidrom");
	}else {
		System.out.println(temp+"is not palidrom");
	}
		
		
	}

}
