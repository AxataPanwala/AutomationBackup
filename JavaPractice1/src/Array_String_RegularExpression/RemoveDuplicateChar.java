//WAP to remove duplicate characters from a given string presents in another given string. 
package Array_String_RegularExpression;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str1="This is main string";
		String str2="Second string";
		
		System.out.println("Given string is :"+str1);
		System.out.println("Second string is : "+str2);
		
		char arr[]=new char[str1.length()];
		char*/
		
		String str1 = "the quick brown fox";
		  String str2 = "queen";
		  System.out.println("The given string is: " + str1);
		  System.out.println("The given mask string is: " + str2);
		  char arr[] = new char[str1.length()];
		  char[] mask = new char[256];
		  for (int i = 0; i < str2.length(); i++)
		   mask[str2.charAt(i)]++;
		  System.out.println("\nThe new string is: ");
		  for (int i = 0; i < str1.length(); i++) {
		   if (mask[str1.charAt(i)] == 0)
		   System.out.print(str1.charAt(i));
		  }
	}

}
