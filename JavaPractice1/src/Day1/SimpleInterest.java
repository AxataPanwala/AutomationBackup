package Day1;

public class SimpleInterest {

	int p=20000,r=5,n=10;
	void Interest()
	{
		System.out.println("The simple interest of value P is : "+((p*r*n)/100));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleInterest si=new SimpleInterest();
		si.Interest();
	}

}
