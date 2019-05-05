class D{
D(){
	D d1=new D(100);
System.out.print("\nD\n");
}
D(int i){
	System.out.print(i);
}
public static void main(String [] args){
	//D d1=new D();
//d1.methord();
System.out.print("\nmethord success\n");
D d2=new D();
d2.methord();
System.out.print("printing 2nd time useing d1");
d2.methord1();
d2.methord(); 
d2.methord2();
/*different methord can be called useing the same adderss location or the variable name
eg: d1,d2,d3*/
new D().methord2();
}
public void methord(){
System.out.print("\nmethord ok\n");
D d4= new D();
d4.methord2();
}
public void methord1(){
System.out.print("\n not a prob ok\n");
}
public void methord2(){
System.out.print("\nambalai\n");
}
public void D(){
	System.out.print("***super star***");
}
}