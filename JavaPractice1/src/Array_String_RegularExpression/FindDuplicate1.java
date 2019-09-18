//WAP to find the duplicate values of an array of integer values. {5,2,2,5,7,4}
package Array_String_RegularExpression;

public class FindDuplicate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={5,2,2,5,7,4};
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && i!=j)
					System.out.println("Duplicate elements: "+arr[j]);
			}
		}
	}
}
