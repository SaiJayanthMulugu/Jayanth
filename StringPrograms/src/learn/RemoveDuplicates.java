package learn;

public class RemoveDuplicates {
	/*public static void main(String[] args) {
		String s="java";
		String s1="";
		for (int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if (s1.indexOf(ch)==-1)
			{
				s1=s1+ch;
			}
		}
		System.out.println(s1);
	}*/
	public static void remove(String s)
	{
		String s1="";
		for (int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if (s1.indexOf(ch)==-1)
			{
				s1=s1+ch;
			}
		}
		System.out.println(s1);
	}
	public static void main(String[] args) {
		String s="java";
		remove(s);
	}
}
