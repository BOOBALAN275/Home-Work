import java.util.Scanner;

class TrafficLight
{
	public static void main(String[] args)
	{
		Scanner Scan = new Scanner (System.in);
		System.out.println("Enter a Traffic Signs");
		String Light = Scan.nextLine();
		
		switch (Light)
		{
			case "Red":
			System.out.println(Light+" is a Stop Sign in Traffic Signal.");
			break;
			
			case "Yellow":
			System.out.println(Light+" is a GetReady Sign in Traffic Signal.");
			break;
			
			case "Green":
			System.out.println(Light+" is a Goo Sign in Traffic Signal.");
			break;
			
			default :
			System.out.println("Invaild in Color Sign.");
			
		}
	}
}