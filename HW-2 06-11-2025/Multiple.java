class Multiple
{
	public static void main(String[] args)
	{
		Multiple m = new Multiple();
		m.Array(16);
		
	}
	void Array(int a)
	{
		for (int i = 1; i<=a; i++)
		{
			for(int j = 1; j<=10; j++)
			{
				int res = i*j;
				System.out.println(i + " x "+ j + " = "+res);
			}

		}
	}
}