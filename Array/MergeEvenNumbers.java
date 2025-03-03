class MergeEvenNumbers 
{
	public static void main(String[] args) 
	{
		//int[] a=new int[4];
		int[] a={2,3,4};    //direct initialization
		//int[] b=new int[5];
		int[] b={5,6,7,8,9,10};
		int s=a.length+b.length;
		//System.out.println(s);
		int[] c=new int[s];
		for (int i=0;i<s;i++)
		{
			if (i%2==0)
			{
				if (i<a.length)
				{
				c[i]=a[i];
				}
				else
				{
				c[i]=b[i-a.length];
				}
			}
		}
		for (int i=0;i<=c.length-1;i++ )
		{
			System.out.print(" "+c[i]+" ");
		}
	}
}
