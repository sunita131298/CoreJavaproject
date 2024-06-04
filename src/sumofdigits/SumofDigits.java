package sumofdigits;

public class SumofDigits {
	public static void main(String[] args) {
		int a=12345;
		int b =0;
		while(a>0) {
			b+=a%10;
			a/=10;
		}
		System.out.println("sum of digits:"+b);
	}

}
