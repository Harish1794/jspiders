class bank{
public static void main (String[]args){
double amtBal = 50000.00;
double amtWithdraw = 40500.50;
int pin = 3829;
if(pin == 3829)
	{ 
		System.out.println("pin valied");
			if(amtWithdraw < (amtBal - 1000))
				{
					System.out.println("transfer sucessful");
					amtBal = amtBal - amtWithdraw;
					System.out.println("amount withdrawed = "+amtWithdraw);
				}
			else
				{
					System.out.println("insuffecient balance");
				}
	}
else
	{	
		System.out.println("invalied pin");
	}
System.out.println("current balance = "+amtBal);
}
}