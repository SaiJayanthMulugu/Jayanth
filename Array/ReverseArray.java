import java.util.Scanner;
class ReverseArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size : ");
		int size=sc.nextInt();
		int[] a=new int[5];
		for (int i=0;i<=a.length-1;i++ )
		{
			System.out.println("enter the element of "+i+"th index");
			a[i]=sc.nextInt();
		}
		for (int i=a.length-1;i>=0 ;--i)
		{
			System.out.println(a[i]);
		}
	}
}
