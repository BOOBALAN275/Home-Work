import java.util.Scanner;

class Grade
{
	public static void main(String[] args)
	{
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter Your Mark");
		int Mark = Scan.nextInt();
		
		if (Mark>=90)
		{
			System.out.println("A Grade");
		}
		else if (Mark>=70 && Mark<90)
		{
			System.out.println("B Grade");
		}
		else if (Mark>=50 && Mark<70)
		{
			System.out.println("C Grade");
		}
		else if (Mark>=25 && Mark<50)
		{
			System.out.println("D Grade");
		}
		else if (Mark<25)
		{
			System.out.println("Fail");
		}
		
	}
}