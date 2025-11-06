import java.util.Scanner;

class MultiSc2
{
	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the Row Value : ");
		int Row = Sc.nextInt();
		System.out.println("Enter the Column Value : ");
		int Column = Sc.nextInt();
		
		int arr[][] = new int[Row][Column];
		
		for(int i = 0; i < Row; i++ )
		{
			for (int j = 0; j < Column; j++)
			{
				System.out.println("Enter The Values : ");
				arr[i][j] = Sc.nextInt();
			}
		}
		for(int i = 0; i < Row; i++)
		{
			for  (int j = 0; j < Column; j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
}