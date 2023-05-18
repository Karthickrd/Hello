package org.emp;

public class Employee
{
	public void empId ( String b)
	{
		System.out.println ( b);
	}
	public void empId (int a)
	{
		System.out.println(a);
	}
	public static void main (String [] args )
    {
	Employee n=new Employee();
	n.empId("adf");
	n.empId(22);
    }
}


