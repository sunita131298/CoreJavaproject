package amstrongnumber;
// (1*1*1) + (5*5*5) + (3*3*3)=153
public class Amstrong {
	public static void main(String[] args) {
		int n=153;
		int sum=0, r=0 ,t=n;
		while(n>0) {
			r=n%10; 
			n=n/10;
			sum=sum+(r*r*r);
			
		}if (t==sum) {
			System.out.println(t+"=is amstrong number");
		}else {
			System.out.println(t+"=is not amstrong number");
		}
		
		
		
		int m=555;
		int k=0, s=0 ,p=m;
		while(m>0) {
			s=m%10; 
			m=m/10;
			sum=sum+(s*s*s);
			
		}if (p==sum) {
			System.out.println(p+"=is amstrong number");
		}else {
			System.out.println(p+"=is not amstrong number");
		}
			
		
		
		int a=111;
		int b=0, c=0 ,d=a;
		while(a>0) {
			c=a%10;
			a=a/10;
			b=b+(c*c*c);
			if(d==0) {
				System.out.println(d+" is a amstrong no");
			}else {
				System.out.println(d+"is not amstrong no");
			}
					
			
		}
		
		
		
		
		
		
	}
	

}
