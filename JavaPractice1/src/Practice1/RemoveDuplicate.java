package Practice1;
public class RemoveDuplicate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="This is the first string";
		String str2="is";
		String str3="";
		int count;
		
		for(int i=0; i<str1.length();i++)
		{
			count=0;
			for(int j=0;j<str2.length();j++)
			{
				if(str1.charAt(i)==str2.charAt(j))
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				str3 = str3 + str1.charAt(i);
			}
		}
		System.out.println(str3);
	}
}
