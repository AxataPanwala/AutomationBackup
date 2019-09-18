//Write a program for different method(make 3 methods) and call from main method and print the output
package Day25ObjectClassMethod;

public class Prog1 {
	void method1() //declaration of method1
	{
		System.out.println("This is method1");
	}
	void method2() //declaration of method2
	{
		System.out.println("This is method2");
	}
	void method3() //declaration of method3
	{
		System.out.println("This is method3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Execution Starts");
		Prog1 obj=new Prog1(); //object creation
		
		obj.method1(); //Call method1
		obj.method2(); //Call method2
		obj.method3(); //Call method3
		System.out.println("End of execution");
	}

}
