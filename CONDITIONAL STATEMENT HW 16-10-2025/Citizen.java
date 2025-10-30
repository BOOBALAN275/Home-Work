import java.util.Scanner;

class Citizen
{
	public static void main(String[] args)
	{
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter Your Age");
		int a = Scan.nextInt();

		if(a>60){
			System.out.println("Your Are A Senior Citizen");
		}
		
		else{
			System.out.println("Your Are Not A Senior Citizen");
		}
	}
}