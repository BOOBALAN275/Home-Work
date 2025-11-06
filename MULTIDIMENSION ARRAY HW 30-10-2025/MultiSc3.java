import java.util.Scanner;

class MultiSc3
{
	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a Length : ");
		int Bk = Sc.nextInt();
		
		int arr[] = new int[Bk];
		
		for(int i = 0; i < Bk; i++ )
		{
			System.out.println("Enter a Values : ");
			arr[i] = Sc.nextInt();
		}
		
		for(int i = Bk-1; i >= 0; i--)
		{
			System.out.println(i+"Index value of array is : "+arr[i]);
		}
		
	}
}