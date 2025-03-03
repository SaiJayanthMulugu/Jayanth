import java.util.Scanner;
class EvenIndex 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size : ");
		int size=sc.nextInt();
		int[] a=new int[size];
		for (int i=0;i<=a.length-1;i++ )
		{
			System.out.println("enter element for "+i+" index : ");
			a[i]=sc.nextInt();
		}
		for (int i=0;i<=a.length-1;i++)
		{
			if (i!=0&&(i%2==0)&&(a[i]%2==1))
			{
				System.out.println(a[i]);

			}
		}
	}
}
