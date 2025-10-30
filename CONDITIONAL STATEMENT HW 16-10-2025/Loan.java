import java.util.Scanner;

class Loan
{
	public static void main(String[] args)
	{
		Scanner Scan = new Scanner(System.in);
		System.out.println("What Is Your Age");
		int Age = Scan.nextInt();
		System.out.println("What Is Your Monthly Income");
		short Income = Scan.nextShort();
		
		if (Age>21 && Income>25000)
		{
			System.out.println("Your Are A Eligible For Loan");
		}
		else 
		{
			System.out.println("Your Are Not Eligible For Loan");
		}
		
	}
}