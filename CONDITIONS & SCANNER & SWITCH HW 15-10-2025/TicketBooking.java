import java.util.Scanner;

class TicketBooking
{
	public static void main(String[] args)
	
	{
		Scanner Scan = new Scanner(System.in);
		System.out.println("Which Destination Have You Go");
		String Place = Scan.nextLine();
		
		switch (Place)
		{
			case "madurai":
			System.out.println("Starting Time Is 9 Clock, Reseaching Time Is 12 Clock");
			break;
			
			case "chennai":
			System.out.println("Starting Time Is 10 Clock, Reseaching Time Is 2 Clock");
			break;
			
			case "trichy":
			System.out.println("Starting Time Is 10 Clock, Reseaching Time Is 11 Clock");
			break;
			
			default :
			System.out.println("No Found");

		}
	}
}