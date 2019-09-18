package Day6;

public class RelationalOperator {
 
	public static void main(String[] args) {
		int a=10,b=20;
		//check == operator
		if(a==b)
			System.out.println("Both a and b are same");
		else
			System.out.println("a and b are not same");
		//check != operator
		if(a!=b)
			System.out.println("Both a and b are not same");
		else
			System.out.println("a and b are same");
		
		//check < operator
		if(a<b)
			System.out.println("a less than b");
		else
			System.out.println("a greater than b");
		
		//check > operator
		if(a>b)
			System.out.println("a greater than b");
		else
			System.out.println("a less than  b");
		
		//check <= operator
		if(a<=b)
			System.out.println("a is less than or equals to b");
		else
			System.out.println("a is greater than or equals to b");
		
		//check >= operator
		if(a>=b)
			System.out.println("a is greater than or equals to b");
		else
			System.out.println("a is less than or equals to b");
	}

}
