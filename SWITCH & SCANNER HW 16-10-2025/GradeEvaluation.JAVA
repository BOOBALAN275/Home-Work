import java.util.Scanner;

class GradeEvaluation

{
	public static void main(String[] args)
	{
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter Your Grade");
		char Grades = Scan.next().charAt(0);
		
		switch (Grades)
		{
		case 'A':
		System.out.println(Grades +" Grade is a OutStanding.");
		break;
		
		case 'B':
		System.out.println(Grades +" Grade is a Exellent.");
		break;
		
		case 'C':
		System.out.println(Grades +" Grade is a Very Good.");
		break;
		
		case 'D':
		System.out.println(Grades +" Grade is a Average.");
		break;
		
		case 'F':
		System.out.println(Grades +" Grade is a Fail.");
		break;
		}
	}
}