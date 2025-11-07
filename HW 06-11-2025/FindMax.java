class FindMax
{
	public static void main(String[] args)
	{
		FindMax f = new FindMax();
		int c = f.Max(15,20);
		System.out.println(c);
	}
	int Max (int a,int b)
	{
		int max = 0;
		if (a<b)
		{
			max = b;
		}
		else if (a>b)
		{
			max = a;
		}
		return max;
	}
	
}