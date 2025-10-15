class Neon
{
	public static void main(String[] args)
	{
		int a = 9;
		int b = a;
		
		int c = a*a;
		int d = c%10;
		int e = c/10;
		int f = (d+e);
		
		boolean Neon = (a==f);

		System.out.println("Neon Number is - "+Neon);
	}
}