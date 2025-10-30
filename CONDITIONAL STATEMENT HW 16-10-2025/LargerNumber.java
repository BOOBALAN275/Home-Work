import java.util.Scanner;

class LargerNumber
{
	public static void main(String[] args)
	{
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter Your First Number");
		int a = Scan.nextInt();
		System.out.println("Enter Your Second Number");
		int b = Scan.nextInt();
		
		if(a>b){
			System.out.println(a+" is a Largest Number");
		}
		else{
			System.out.println(b+" is a Largest Number");
		}
	}
}