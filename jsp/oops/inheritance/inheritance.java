import java.util.Scanner;
class employee
{
	String name;
	int id;
	double sal;
	employee (String name,int id,double sal)
	{
		this.name = name;
		this.id = id;
		this.sal = sal;
		System.out.println("printing through this");
	}
}
class manager extends employee
{
	manager (String name,int id,double sal)
	{
		super (name,id,sal);
	}
	void print (String name,int id,double sal)
	{
		System.out.println("name of the employee="+name);
		System.out.println("employee id ="+id);
		System.out.println("employee sallary="+sal);
	}
}


			

class inheritance 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the name");
		String name = sc.nextLine();
		System.out.println("enter the id");
		int id = sc.nextInt();
		System.out.println("enter the sallary");
		double sal = sc.nextDouble();
		manager m = new manager(name,id,sal);
		System.out.println("****************************");
		m.print(name,id,sal);	
	}
}
