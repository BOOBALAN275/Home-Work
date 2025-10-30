import java.util.Scanner;

class VowelOrConsonant
{
	public static void main(String[] args)
	{
		Scanner Scan = new Scanner (System.in);
		System.out.println("Enter Your Characters");
		char Words = Scan.next().charAt(0);
		
		switch(Words)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			System.out.println(Words+" is a Vowel");
			break;
			
			default :
			System.out.println(Words+ " is a Consonant");
		}
		
	}
}