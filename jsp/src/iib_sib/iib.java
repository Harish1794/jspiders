class iib{
{
System.out.print("\n1st iib\n");
}
public double iib(double j){
System.out.print(j);
return 30.3;
}
iib(){
System.out.print("\nfron constructor\n");
}
static int  j = 5432;
static
{
int	 i=98765;
	System.out.print(i);
	System.out.print(j);
System.out.print("\n1st sib\n");
}
public static void main(String[]args)
{
System.out.print("\nfrom main\n");
double d1=new iib().iib(40.1);
System.out.print(d1);
iib d2=new iib();
System.out.print(d2.test());

//d2.test();                           /*wrong statment*/

}
public float test(){
	System.out.print("\nlearning java\n");
	return 1000.342f;
}
}
