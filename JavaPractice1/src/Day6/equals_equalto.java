package Day6;

public class equals_equalto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=10;
		
		System.out.print("== operators result is : ");
		if(a==b)
			System.out.println("Both strings are equal");
		else
			System.out.println("Both strings are not equal");
		
		String str1="Happy Day";
		String str2="Happy Day";
		
		System.out.println(".equals() method result is : "+str1.equals(str2));
	}
}
