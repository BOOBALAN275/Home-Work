import java.util.Scanner;

class ElectricityBill

{
	public static void main(String[] args)
	{
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter Your Unit");
		
		int Unit = Scan.nextInt();
		int Comic;
		
		if (Unit <= 100)
		{
			Comic = Unit*5;
			System.out.println("Electricity Bill Units Is - "+ Comic);
		}
		else if (Unit > 100 && Unit <= 200)
		{
			Comic = Unit*7;
            System.out.println("Electricity Bill Units Is - "+ Comic);				
		}
		else if (Unit > 200)
		{
			Comic = Unit*10;
            System.out.println("Electricity Bill Units Is - "+ Comic);				
		}
		
		else 
		{
			System.out.println("Invaild");
		}
	}
}