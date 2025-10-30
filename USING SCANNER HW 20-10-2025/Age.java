import java.util.Scanner;

class Age
{
	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String Scn = Sc.nextLine();
		System.out.println("Enter Your Age");
		int Age = Sc.nextInt();
		
		if (Age <= 13)
		{
			System.out.println("RajKannan Your Are a "+Age+" Is a Child Age ");
		}
		else if (Age > 13 && Age <= 19)
		{
		    System.out.println("RajKannan Your Are a "+Age+" Is a Teengar Age ");
		}
		else if (Age > 20 && Age <= 59)
		{
		    System.out.println("RajKannan Your Are a "+Age+" Is a Adult Age ");
		}
		else if (Age > 60) 
		{
			System.out.println("RajKannan Your Are a "+Age+" Is a Senior Age");
		}
		else 
		{
			System.out.println("Invaild Age");
		}
	}
}