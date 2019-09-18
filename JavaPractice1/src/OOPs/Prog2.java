/*Q.2 Create program with following functionality:
a) Create two classes with name 'Employee' and 'Department'.
b) Create one method 'basic_pay' in Employee(Use Basic pay = number of working days * pay per day)
c) Override method 'basic_pay' in Department class*/

package OOPs;

class Employee
{
	void basic_pay()
	{
		int basicPay, num_of_working_days=150,pay_per_day=200;
		basicPay=num_of_working_days*pay_per_day;
		System.out.println("basic_pay method from Employee : "+basicPay);
	}
}

class Department extends Employee
{
	void basic_pay()
	{
		int basicPay, num_of_working_days=150,pay_per_day=200;
		basicPay=num_of_working_days*pay_per_day;
		System.out.println("basic_pay method from Department : "+basicPay);		
	}
}

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department dp=new Department();
		Employee e=new Department();
		dp.basic_pay();
		e.basic_pay();
	}
}
