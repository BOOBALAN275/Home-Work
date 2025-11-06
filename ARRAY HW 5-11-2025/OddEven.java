class OddEven
{
	public static void main(String[] args)
	{
		int OddSum = 0;
		int EvenSum = 0;
		int OddCount = 0;
		int EvenCount = 0;
		int arr[] = {13,6,25,12,7,14,32,17};
		
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i]%2==0)
			{
				EvenSum = arr[i]+EvenSum;
				EvenCount++;
			}
			else 
			{
				OddSum = arr[i]+OddSum;
				OddCount++;
			}
		}
		System.out.println("Sum of Even Number are : "+EvenSum);
		System.out.println("Sum of Odd Number are : "+OddSum);
		System.out.println("Number of Count is : "+EvenCount);
		System.out.println("Number of Count is : "+OddCount);
		
	}
}