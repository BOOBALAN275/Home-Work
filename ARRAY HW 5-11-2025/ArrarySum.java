class ArraySum
{
	public static void main(String[] args)
	{
		int sum = 0;
		int arr[] = {2,7,13,6,14,27,15,2};
		
		for (int i = 0; i < arr.length; i++)
		{
			sum = arr[i]+sum;
		}
		System.out.println("Sum of Arrary Total Values is : "+sum);
	}
}