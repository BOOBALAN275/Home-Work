import java.util.Scanner;
class Character
{
	public static void main(String[] args)
	{
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter Your Character");
		char Words = Scan.next().charAt(0);
		
		if (Words=='a'|| Words=='e'|| Words=='i'|| Words=='o'|| Words=='u')
		{
		    System.out.println("This " + Words + " is a Vowel");
		}
		
		else 
		{
			System.out.println("This " + Words + " is a Constant");
		}
			
	}
}