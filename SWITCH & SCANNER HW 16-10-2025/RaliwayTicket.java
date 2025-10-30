import java.util.Scanner;

class RaliwayTicket
{
	public static void main(String[] args)
	{
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter Seat Type");
		int Ticket = Scan.nextInt();
		
		switch (Ticket)
		{
			case 1:
			System.out.println(Ticket+ " class is a General Unreserved.");
			System.out.println("Rate Approximately 100 to 150.");
			break;
			
			case 2:
			System.out.println(Ticket+ " class is a Sleeper.");
			System.out.println("Rate Approximately 300 to 400.");
			break;
			
			case 3:
			System.out.println(Ticket+ " class is a AC3 Tier.");
			System.out.println("Rate Approximately 750 to 900.");
			break;
			
			case 4:
			System.out.println(Ticket+ " class is a AC2 Tier.");
			System.out.println("Rate Approximately 600 to 800.");
			break;
			
			case 5:
			System.out.println(Ticket+ " class is a First Class.");
			System.out.println("Rate Approximately 1500 to 2000.");
			break;
			
			default :
			System.out.println("Invaild");
		}
	}
}