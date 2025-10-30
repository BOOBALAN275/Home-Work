import java.util.Scanner;

class VoteEligible
{
	public static void main(String[] args)
	{
		Scanner Scan = new Scanner(System.in);
		int Age = Scan.nextInt();
		
		if (Age >= 1 && Age <=16)
		{
			System.out.println("Your Are A School Student");
		}
		else if (Age > 16 && Age <= 18)
		{
			System.out.println("Your Are A Higher Scondary School Student");
		}
		else 
		{
			System.out.println("Your Are A College Student");
		}
	}
}