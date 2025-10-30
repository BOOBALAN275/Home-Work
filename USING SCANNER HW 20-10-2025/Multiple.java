import java.util.Scanner;

class Multiple
{
	public static void main(String[] args)
	{
		Scanner Sc = new Scanner (System.in);
		System.out.println("Enter a Number");
		
		int num = Sc.nextInt();
		
		if (num % 3 == 0 && num % 7 == 0)
		{
			System.out.println(num +" is a multiple by 3 and 7");
		}
		else if (num % 3 == 0)
		{
			System.out.println(num +" is a multiple by 3");
		}
		else if (num % 7 == 0)
		{
			System.out.println(num +" is a multiple by 7");
		}
		else 
		{
			System.out.println(num+" Is a Not Multiple by 3 and 7");
	    }
	}
}