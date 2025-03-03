class Summation1Last 
{
	public static void main(String[] args) 
	{
		int [] a={12,13,14,15,16,17};
		int sum=0;
		for (int i=0;i<=a.length-1;i++ )
		{
			sum=a[0]+a[a.length-1];
		}
		System.out.println(sum);
	}
}
