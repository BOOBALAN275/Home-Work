class Palindrome
{
	public static void main(String[] args)
	{
		int a = 323;
		int b = a;
		
		int c = a%10;
		int d = a/10;
		int e = d%10;
		int f = d/10;
		int g = (c*100)+(e*10)+(f*1);
		
		boolean Palin = (a==g);
		
		
		System.out.println("Palindrome Number is - "+Palin);
	}
}