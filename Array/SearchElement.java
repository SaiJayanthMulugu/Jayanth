import java.util.Scanner;
class SearchElement 
{
	/*public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element : ");
		int s=sc.nextInt();
		int []a={1,2,3,4,5,6,7,8,9};
		for (int i=0;i<=a.length-1;i++ )
		{
			if (a[i]==s)
			{
				System.out.println("the element is present");
			}
			?*else
			{
				System.out.println("the element is not present");
			}*
		}
	}*/
	public static String isPresent(int []a,int element)
	{
		boolean isPresent=false;
		for (int i=0;i<=a.length-1;i++)
		{
			if (a[i]==element)
			{
				isPresent=true;
				return "yes given element is  present";
			}
		}
		if (isPresent==false)
		{
			return "given element is not present ";
		}
		return " ";
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int []a={1,2,3,4,5,6,7,8,9};
		System.out.println("enter the element : ");
		int s=sc.nextInt();
		String res=isPresent(a,s);
		System.out.println(res);
	}
		
}
