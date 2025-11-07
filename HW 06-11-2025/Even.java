class Even
{
	public static void main (String[] args)
	{
		Even e = new Even();
		boolean c = e.Sum(20);
		System.out.println(c);
	}
	boolean Sum(int a)
	{
		if (a%2==0)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}