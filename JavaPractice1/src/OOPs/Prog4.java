/*Q.4 Create program with following functionality:
a) Create abstract class with abstract method 'run'.
b) Inherit abstract class into non- abstract class named 'car'
c) Implement 'run' method in 'car' class*/
package OOPs;

abstract class class1
{
	abstract void run();
}

class car extends class1
{
	void run()
	{
		System.out.println("Run method in car that extends class1");
	}
}

public class Prog4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c=new car();
		c.run();
	}
}
