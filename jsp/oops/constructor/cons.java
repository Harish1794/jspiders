
class A
{
	int x;
	double y;
	A()
	{
		System.out.println("inside A without argument");
	}
	A(int arg)
	{
		x=arg;
		System.out.println("a.x="+x);
	}
	A(int arg1,double arg2)
	{
		x = arg1;
		y= arg2;
		System.out.println("a2.x="+x);
		System.out.println("a2.y="+y);
	}
	A(double arg1,int arg2)
	{
		y=arg1;
		x=arg2;
		System.out.println("a3.x="+y);
		System.out.println("a4.y="+x);
	}
}
class cons 
{
	public static void main(String[] args) 
	{
		//A a = new A();
		A a1 = new A('A');
		//A a2 = new A(10,34.75);
	   // A a3 = new A(34.75,10);
	//	A a4 = new A(10,340);

		System.out.println("A.x="+a1.x);
		a1.x='c';
		System.out.println("A.x="+a1.x);
	}
}
