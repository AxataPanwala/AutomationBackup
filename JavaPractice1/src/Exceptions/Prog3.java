package Exceptions;

public class Prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a[]= new int[5];
			//a[5]=30/0;
			System.out.println(a[10]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception execute");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bound exception execute");
		}
		catch(Exception e)
		{
			System.out.println("Exception execute");
		}
		finally
		{
			System.out.println("Execution done");
		}

	}

}
