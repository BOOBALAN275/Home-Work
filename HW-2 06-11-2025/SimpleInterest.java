class SimpleInterest
{
	public static void main(String[] args)
	{
		SimpleInterest s = new SimpleInterest();
		float rem = s.Interest(10,8,2);
        System.out.println("The Principle Amount is :- "+rem);		
	}
	float Interest (int p, int r, int t)
	{
		float Year = t/365.0f;
		float Given = (p*r*Year)/100.0f;
		return Given;
	}
}