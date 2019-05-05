import java.util.Scanner;
class  jsp
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		String str;
		System.out.println("enter the string");
		str =	sc.nextLine();
		sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			char ch= str.charAt(i);
			switch (ch)
			{
			case 'a': 
			case 'e': 
			case 'i': 
            case 'o': 
			case 'u': 
				System.out.println(" vovel in jspider="+i);
			
			}
	
	}}}

	//public static void vovle(String str)
