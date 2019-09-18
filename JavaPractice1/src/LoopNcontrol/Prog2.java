//WAP to calculates the sum of an integer array {3, 4, 5, -5, 0, 12}. (using for each loop)
package LoopNcontrol;
public class Prog2 {

	public static void main(String[] args) {
		int[] arry={3,4,5,-5,0,12};
		int sum=0;
		
		for(int i:arry)
		{  
			sum=sum+i;			 
		}
		System.out.println(sum);
	}
}
