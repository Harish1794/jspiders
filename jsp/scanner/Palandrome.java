import java.util.Scanner;
class Palandrome 
{
	public static void main(String[] args) 
	{
		String a;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string input");
		a = sc.nextLine();
		for (int i=0,j = a.length()-1;i<j ;i++,j--)
		{
			if (a.charAt(i) != a.charAt(j))
			{
				System.out.println("not a palandrome");
				return;
			}	
			System.out.println("thr given string "+a+" is palandrome");
		}
	
	}


}
