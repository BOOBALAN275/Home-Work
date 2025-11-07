class Add
{
	public static void main(String[] args)
	{
		Add a = new Add();
		int rem = a.Sum(15,20);
		System.out.println(rem);
	}
	int Sum(int a, int b)
	{
		int c = a+b;
		return c;
	}
}