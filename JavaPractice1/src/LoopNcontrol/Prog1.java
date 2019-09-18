//WAP to find the sum of natural numbers from 1 to 100. (using while loop)
//This programm is to do the sum of the natural numbers from 1 to 100. fiest i declare the variables and then create a while loop with the condition,
//it will do the sum of the numbers and will display final ans after the while loop.
package LoopNcontrol;

public class Prog1 {

	public static void main(String[] args) {
		int i=1, sum=0;
		
		while(i<=100)
		{
			sum=sum+i;
			i++;
		}
		System.out.println("The sum of 1 to 100 is : "+sum);

	}

}
