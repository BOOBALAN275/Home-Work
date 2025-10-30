import java.util.Scanner;

class MonthDays
{
	public static void main(String[] args)
	{
		Scanner Scan = new Scanner (System.in);
		System.out.println("Enter Your Month");
		int Months = Scan.nextInt();
		
		switch (Months)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
			System.out.println("This Months "+Months+" has 31 Days.");
			break;
			
			case 2:
			System.out.println("This Months "+Months+" has 28 Or 29 Days.");
			break;
			
			case 4:
			case 6:
			case 9:
			case 11:
			System.out.println("This Months "+Months+" has 30 Days.");
			break;
			
			default :
			System.out.println("Invalid month number! Please enter between 1 and 12.");
			
		}
	}
}