package Day25ObjectClassMethod;

public class ArithmeticOperations {

	void add(int a,int b)
	{
		System.out.println("Addition of 2 nos is : "+(a+b));
	}
	void sub(int a,int b)
	{
		System.out.println("Subtraction of 2 nos is : "+(a-b));
	}
	
	void mul(int a,int b)
	{
		System.out.println("Multiplication of 2 nos is : "+(a*b));
	}
	int div(int a,int b)
	{
		return (a/b);
		//System.out.println("Division of 2 nos is : "+(a/b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=20;
		int ans;
		ArithmeticOperations ao=new ArithmeticOperations();
		ao.add(a,b);
		ao.mul(a,b);
		ans =ao.div(a,b);
		System.out.println("division is : " +ans);
	}

}
