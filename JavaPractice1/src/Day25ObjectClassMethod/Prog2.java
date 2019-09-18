//Write a program for calling methods and print the output
	//Note: method1 should return a value
	  //    method2 without return value
package Day25ObjectClassMethod;

public class Prog2 {

	void method1() //method1 without return value
	{
		System.out.println("Method1 is not return a value");
	}
	int method2() //method2 with return value
	{
		int a=100;
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prog2 obj=new Prog2(); //object declaration
		
		obj.method1(); //call method1
		
		int ans=obj.method2(); //call method2
		System.out.println("Method2 return value is : "+ans);

	}

}
