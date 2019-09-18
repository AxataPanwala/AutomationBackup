package Day1;

public class CallMethod2 
{
	void method1()
	{
		System.out.println("method 1 called");
	}
	
	String method2()
	{
		String myname="method 2 ";
		return myname;
	}
	
	public static void main(String[] args) 
	{
		CallMethod2 cm=new CallMethod2();
		cm.method1();
		String s=cm.method2();
		System.out.println(s+"called");
	}

}
