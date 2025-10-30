import java.util.Scanner;

class Palilloop
{
	public static void main(String[] args)
	
	{
		Scanner Sc = new Scanner (System.in);
		System.out.println("Enter a Palildrome Number");
		int Comic = Sc.nextInt();
		
		int a = Comic;
		int temp = a;
		int rem = 0;
		int sum = 0;
		
		while(a > 0)
		{
			rem = a%10;
			sum = rem + (sum*10);
			a = a/10;
		}
		
		if (sum == temp)
		{
			System.out.println("it is a Palildrome Number");
		}
		else 
		{
			System.out.println("it not a Palildrome Number");
		}
	}
}