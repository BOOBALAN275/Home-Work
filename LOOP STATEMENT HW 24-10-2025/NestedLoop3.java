class NestedLoop3
{
	public static void main(String[] args)
	{
		int n = 4;
		for (int i = 1; i <= n; i++)
		{
			for (int k = i; k < n; k--)
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= (2*i)-1; j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		
		for (int i = n-1; i >= 1; i--)
		{
			for (int k = n; k > n; k--)
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= (2*i)-1; j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		

		
		
		

	}
}