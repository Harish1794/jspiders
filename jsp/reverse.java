import java.util.Scanner;
class  reverse
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		String str;
		System.out.println("enter the string");
		str =	sc.nextLine();
		//sc.nextLine();
		rev(str);
		
	}

	public static void rev(String str)
	{
		for(int i=str.length()-1;i>=0;i--)
			System.out.println(str.charAt(i));
	}

}
