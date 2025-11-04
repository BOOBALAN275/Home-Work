class DoWhile3
{
	public static void main(String [] args)
	{
		int a = 1;
		do 
		{
			if (a % 2 == 0)
			{
				System.out.println(a+" is a even number");
			}
			a++;
		}while (a <= 30);
	}
}