/*1. Create program with following functionality:
a) Create two classes with name 'Student' and 'marks'.
b) Create one method 'Total_Marks' in student
c) Inherit Student class methods into marks class
d) Create 'Percentage' method in 'Marks' Class with return value.*/

package OOPs;

class Student
{
	int m1=39,m2=35,m3=36,total;
	void Total_Marks()
	{
		total=m1+m2+m3;
		System.out.println("Total_marks method in Student is : "+total);
	}
}

class marks extends Student
{
	void Percentage()
	{
		float per=(total*100)/150;
		System.out.println("Percentage is : "+per);
	}
}
public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marks m=new marks();
		m.Total_Marks();
		m.Percentage();	
	}
}
