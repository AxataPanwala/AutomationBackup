package Day9;

/* {
	
		   public static void main(String args[]){
		      int d = 0;
		      int n = 20;
		      int fraction = n/d;
		     System.out.println("End Of Main");
		   }
		
}*/

 public class ExceptionHandling1
{
	 public static void main(String args[]) 
	 {
		  int d = 0;
		  int n = 20;
		  try 
		  {
		  		int fraction = n / d;
		  		System.out.println("This line will not be Executed" + fraction);
		  } 
		  catch (ArithmeticException e) 
		  {
			  System.out.println("In the catch Block due to Exception = " + e);
		  }
		  System.out.println("End Of Main");
	 }
}