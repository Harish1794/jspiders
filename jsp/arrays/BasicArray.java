import java.util.Scanner;
class BasicArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int[] intArray = readArray();

		//int evenCount = isEven(intArray);     for printing evenCount from main method 
		
		isEven(intArray);
		isOdd(intArray);
		int sum = sumOfArray(intArray);
		averageOfArray(intArray,sum);
		
	}

	public static int[] readArray()
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the array size");
		int size = sc.nextInt();
		int[] intArray = new int[size];
		System.out.println("enter the elements of the array");
		for (int i=0;i<size;i++)
		{
			intArray[i] = sc.nextInt();
		}
		return intArray;
	}

	public static void isEven(int[] intArray)
	{
		int evenCount = 0;
		for (int i=0;i<intArray.length;i++)
		{
			if (intArray[i] % 2 == 0)
			{
				evenCount ++;
			}
		}
		System.out.println("no of even number in the array = "+evenCount);
			
			//return evenCount;             for returning the value to main
	}

	public static void isOdd(int [] intArray)
	{
		int oddCount = 0;
		for (int i=0;i<intArray.length ;i++ )
		{
			if ((intArray[i] / 2)*2 != intArray[i])
			{
				oddCount++;
			}
		}
		System.out.println("no of odd number in the array = "+oddCount);
	}
	
	public static int sumOfArray(int [] intArray)
	{
		int sum=0;
		for (int i=0;i<intArray.length;i++)
		{
			sum = sum + intArray[i];
		}

		System.out.println("sum of the value of the array = "+sum);
		return sum;
	}

	public static void averageOfArray(int [] intArray,int sum)
	{
		int average = 0;
		average = sum/intArray.length;
		System.out.println("the average of the given array is = "+average);
	}
}
