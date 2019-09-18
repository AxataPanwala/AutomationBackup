package Day6;

public class AssignmentOperator {
 
	public static void main(String[] args) {
		int a=10,b=20;
		//check = operator
		a=b;
		System.out.println("Value of a after a=b: " + a);
		
		//check += operator
		b+=a;
		System.out.println("Value of b after b+=a : "+b);
				
		//check -= operator
		b-=a;
		System.out.println("Value of b after b-=a : "+b);
		
		//check *= operator
		b*=a;
		System.out.println("Value of b after b*=a : "+b);
			
		//check /= operator
		b/=a;
		System.out.println("Value of b after b/=a : "+b);
		//check %= operator
		b%=a;
		System.out.println("Value of b after b%=a : "+b);
		
		//check <<= operator
		b<<=2;
		System.out.println("Value of b after b<<2 : "+b);
				
		//check >>= operator
		b>>=2;
		System.out.println("Value of b after b>>2 : "+b);
			
		//check &= operator
		b&=2;
		System.out.println("Value of b after b&=2 : "+b);
		//check ^= operator
		b^=2;
		System.out.println("Value of b after b^=2 : "+b);
		//check |= operator
		b|=2;
		System.out.println("Value of b after b|=2 : "+b);
	}

}
