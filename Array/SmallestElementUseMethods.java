class SmallestElementUseMethods 
{
	public static boolean isEmpty(int []a)
	{
		if (a.length==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void smallest(int []a)
	{
		int smallest=0;
		for (int i=0;i<=a.length-1;i++ )
		{
			if (a[i]<smallest)
			{
				smallest=a[i];
			}
		}
		System.out.println("smallest : "+smallest);
	}
	public static boolean isNegative(int []a)
	{
		for (int i=0;i<=a.length-1;i++ )
		{
			if (a[i]<0)
			{
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) 
	{
		int []a={1,2,4,5,0,-2 };
		if (isEmpty(a))
		{
			System.out.println("array doesn't contain any element");
		}
		else
		{
			if (isNegative(a))
			{
				System.out.println("arrray contain negative element");
			}
			else
			{
				smallest(a);
			}
		}
	}
}
