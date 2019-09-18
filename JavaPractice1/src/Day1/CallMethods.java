package Day1;
public class CallMethods {
	void call1()
	{
		System.out.println("First method called successfully");
	}
	void call2()
	{
		System.out.println("Second method called successfully");
	}
	void call3()
	{
		System.out.println("Third method called successfully");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallMethods cm=new CallMethods();
		cm.call1();
		cm.call2();
		cm.call3();
	}
}
