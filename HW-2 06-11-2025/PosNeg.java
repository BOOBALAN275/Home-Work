class PosNeg
{
	public static void main(String[] args)
	{
		int arr[] = {12,18,-2,36,45,-21,1};
		PosNeg p = new PosNeg();
		p.Array(arr);
		
	
	}
	void Array (int arr[])
	{
		for (int i = 0; i<arr.length; i++)
		{
			if (arr[i]>0)
			{
				System.out.println(arr[i]+" is a Positive");
			}
			else if (0>arr[i])
			{
				System.out.println(arr[i]+" is a Negative");
			}
		}
	}
}