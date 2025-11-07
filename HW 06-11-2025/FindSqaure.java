class FindSquare
{
	public static void main(String[] args)
	{
		int a = 20;
		
		FindSquare f = new FindSquare();
		int b = f.Square(a);
		System.out.println(b);
	}
	int Square(int a)
	{
		int c = a*a;
		return c;
	}
}