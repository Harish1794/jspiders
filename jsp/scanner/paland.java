import java.util.Scanner;
class paland
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		String str;
		System.out.println("enter the string");
		str = sc.nextLine();
		String strRev = pal(str);
        System.out.println("strRev value is ="+strRev);
		check(strRev,str);
	}
    public static String pal (String str)
		{
			String temp = "";
			for (int i= str.length()-1;i>=0 ;i-- )
			{
				temp = temp + str.charAt(i);
			}	
				return temp;
		}

	public static void check(String strRev,String str)
		{
			if (strRev.equals(str))
			{
				System.out.println("given string is a palandrome");
				return;
			}
			else
			{
				System.out.println("given string is not a palandrome");
			} 
		}

}
