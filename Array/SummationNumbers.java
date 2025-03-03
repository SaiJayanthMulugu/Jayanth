import java.util.Scanner;
class SummationNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size : ");
		int size=sc.nextInt();
		int[] a=new int[size];
		for (int i=0;i<=a.length-1;i++ )
		{
			System.out.println("enter the elements at "+i);
			a[i]=sc.nextInt();
		}
		int sum=0;
		for (int i=0;i<=a.length-1;i++ )
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		
	}
}
