import java.util.Scanner;

class Week
{
	public static void main(String[] args)
	{
		Scanner Scan = new Scanner(System.in);
		System.out.println("Write a Day of Week");
		int Day = Scan.nextInt();
		
		switch(Day)
		{
			case 1:
			System.out.println(1+" is a Monday");
			break; 
			
			case 2:
			System.out.println(2+" is a Tuesday");
			break;
			
			case 3:
			System.out.println(3+" is a Wednesday");
			break;
			
			case 4:
			System.out.println(4+" is a Thursday");
			break;
			
			case 5:
			System.out.println(5+" is a Friday");
			break;
			
			case 6:
			System.out.println(6+" is a Saturday");
			break;
			
			case 7:
			System.out.println(7+" is a Sunday");
			break;
			
			
		}
	}
}