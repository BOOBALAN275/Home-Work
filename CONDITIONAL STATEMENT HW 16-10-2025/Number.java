import java.util.Scanner;
class Number
{
	public static void main(String[] args)
	{
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int a = Scan.nextInt();
		
		if(a>0)
		{
			System.out.println(a+ " is a Positive Number");
		}
		else if(a<0)
		{
			System.out.println(a+ " is a Negative Number");
		}
		else
		{
			System.out.println(a+ " is a Neutral Number");
		}
	}
}