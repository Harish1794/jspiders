class cons{
cons(String i){
System.out.print("hello\n");
System.out.print(i);
}
public static void main(String[]args){
cons cons1 = new cons("\nmr");
System.out.print("\tharish\n");
cons1.methord();
System.out.print("main sucess");
cons1.methord();
System.out.print("object sucess");
//cons cons2 = new cons();
cons1.methord1();
//new cons().cons();
}
public void methord(){
	System.out.print("\nmethord sucess\n");
}
public void methord1(){
	System.out.print("\nmind celar fine\n");
}
public void cons(){
	System.out.print("\nparashakthi hero da\n");
}
}