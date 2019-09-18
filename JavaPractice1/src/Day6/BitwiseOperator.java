//WAP for bitwise operator (~,&,|,^,<<,>>,>>>).
package Day6;

public class BitwiseOperator {

	public static void main(String[] args) {
		int no1=20, no2=2, no3=0;
		//to check ~ operator
		System.out.println("~no1 = " + ~no1);
		
		//to check & operator
		System.out.println("no1 & no2 = " + (no1 & no2));
		
		//to check | operator
		System.out.println("no1 | no2 = " + (no1 | no2));
		
		//to check << operator
		no3 = no1 <<  2;
		System.out.println("no1 << 2 = " + no3);
		
		//to check >> operator
		System.out.println("no1 >> 2  = " + no3);
		
		//to check >>> operator
		no3 = no1 >>> 2;
		System.out.println("no1 >>> 2 = " + no3);

	}

}
