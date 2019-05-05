class D{
int i=10;
public static void main(String[]args){
D d1 = new D();
System.out.println(d1.i);
d1.test1();
System.out.print("test1 in main\n");
D d2 = new D();
d2.test2(2);
System.out.print("\ninteger succes in main\n");
D d3=new D();
float f=d3.test3(1.1f);
System.out.print(f);
D d4=new D();
d4.test4();
System.out.print("\nstop for d day\n");
d1.test1();
}
public void test1(){
	System.out.print("test1 in methord\n");
	D d5=new D();
	d5.test4();
}
public int test2(int j){
	System.out.print(j);
	return 0;
}
public float test3(float k){
	System.out.print(k);
	D d6=new D();
    d6.test1();
	return 2.1f;
}
public void test4() {
System.out.print("\nsuccess\n");
}
}
