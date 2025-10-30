import java.util.Scanner;

class EvenOrOdd
{
	public static void main(String[] args)
	{
	Scanner Scan = new Scanner(System.in);
	System.out.println("Enter Your Number");
	int Num = Scan.nextInt();
	

	if(Num%2==0)
	{
		System.out.println(Num+ " is a Even Number");
	}		
	else
	{
		System.out.println(Num+ " is a Odd Number");
	}
	}		
}