import java.util.Scanner;

class MultiSc

{
	public static void main (String[] args)
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter The Number Array Length : ");
		int len = Sc.nextInt();
		
		int Bs[] = new int[len];
		
		for(int i = 0; i < Bs.length; i++ )
		{
			System.out.println("Enter The Value : ");
			Bs[i] = Sc.nextInt();
		}
		
		for(int i = 0; i < Bs.length; i++)
		{
			System.out.println("The "+i+ "index value of array is : "+Bs[i]);
		}
	}
}