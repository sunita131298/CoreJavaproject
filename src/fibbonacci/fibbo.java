package fibbonacci;
//1,1,2,3,4,5,8,13,21
//the next number is the sum of previous two number

//0+0=0,0+1=1,1+1=2,2+1=3,3+2=5,5+3=8;8+5=13....
public class fibbo {
	public static void main(String[] args) {
		int n=10, f1=0, f2=1,f3;
		for(int i=1;i<=10;i++) {
			f3=f1+f2;
			System.out.println(f3);
			f1=f2;
			f2=f3;
		}
		}
	
	}
