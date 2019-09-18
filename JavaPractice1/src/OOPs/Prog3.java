/*Q.3 Create program with following functionality:
a) Create class with name 'Student'
b) Create method with name 'total_marks' with 6 arguments.
c) Overload method 'total_marks' with 7 arguments*/
package OOPs;

class Student1
{
	int total_marks(int m1,int m2,int m3, int m4, int m5,int m6)
	{
		int total=m1+m2+m3+m4+m5+m6;
		return total;
	}
	int total_marks(int m1,int m2,int m3, int m4, int m5,int m6,int m7)
	{
		int total=m1+m2+m3+m4+m5+m6+m7;
		return total;
	}
}
public class Prog3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s=new Student1();
		int ans1=s.total_marks(10, 10, 10, 10, 10, 10);
		int ans2=s.total_marks(20, 20, 20, 20, 20, 20, 20);
		
		System.out.println("Total marks of 6 subjects :"+ans1);
		System.out.println("Total marks of 7 subjects :"+ans2);
	}

}
