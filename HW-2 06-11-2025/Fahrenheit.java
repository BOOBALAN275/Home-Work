class Fahrenheit
{
	public static void main (String[] args)
	{
		Fahrenheit f = new Fahrenheit();
		float b = f.Convert (50);
		System.out.println("Converted a Value is :- "+b);
	}
	float Convert (int a)
	{
		float Value = a * 1.8f + 32;
		return Value;
	}
}