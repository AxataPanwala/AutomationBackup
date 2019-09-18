//WAP of multi dimensional array
package Array_String_RegularExpression;

public class MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String[][] arrStr = new String[3][4];
		for (int i = 0; i < arrStr.length; i++) {
			for (int j = 0; j < arrStr[i].length; j++) {
				arrStr[i][j] = "Str" + j;
				System.out.print(arrStr[i][j] + " ");
			}
			System.out.println("");
		}*/
		
		/*int arr[][]={{1,2,3,4},{2,3,4,5},{3,4,5,6},{4,5,6,7}};
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}*/
		
		int[][] array=new int[3][4];
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				System.out.print(i+"-"+j+" ");
			}
			System.out.println();
		}

	}

}
