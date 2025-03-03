class LargestElement 
{
	public static void main(String[] args) 
	{
		int a[]={1,3,6,2,7};
		int largest=a[0];
		for (int i=0;i<=a.length-1;i++ )
		{
			if (a[i]>largest)
			{
				largest=a[i];
			}
		}
		System.out.println(largest);
	}
}
