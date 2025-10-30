import java.util.Scanner;

class Alphabet
{
	public static void main(String[] args)
	{
	Scanner Scan = new Scanner(System.in);
	System.out.println("Enter Your Character");
	char Word = Scan.next().charAt(0);
	
	if ((Word >= 'a' && Word <= 'z')||(Word >= 'A' && Word <= 'Z'))
	{
		System.out.println(Word+ " Is An Alphabet");
	}
	else 
	{
		System.out.println(Word+ " Is Not An Alphabet");
	}
	}
}