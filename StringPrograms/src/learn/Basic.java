package learn;

public class Basic 
{
	public static void main(String[] args) {
		String s="JaYaNtH";
		for (int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if (ch>='A' && ch<='Z')//(ch>=65 && ch<=90)
			{
				System.out.println(ch);
			}
		}
	}
}
