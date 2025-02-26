//WAPTP the characters which are present in even indexes.
package learn;

public class EvenIndexChar 
{
	/*public static void main(String[] args) {
		String s="jayanth";
		for (int i=0;i<=s.length()-1;i++)
		{
			if (i%2==0)
			{
				char ch=s.charAt(i);
				System.out.println(ch);
			}
		}
	}*/
	public static void even(String s)
	{
		for (int i=0;i<=s.length()-1;i++)
		{
			if (i%2==0)
			{
				char ch=s.charAt(i);
				System.out.println(ch);
			}
		}
	}
	public static void main(String[] args) {
		String s="jayanth";
		even(s);
	}
}
