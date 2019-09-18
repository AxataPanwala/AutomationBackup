//Write a program for bank application with simple interest method
package Day25ObjectClassMethod;

public class SimpleInterest {
	float interest(int p, int r,int n)
	{
		float amt;
		amt=(p*r*n)/100;		
		return amt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleInterest si=new SimpleInterest();
		
		float ans=si.interest(10000, 10, 5);
		System.out.println("Simple interest is : "+ans);
	}

}
