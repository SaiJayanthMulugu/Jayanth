package learn;

public class ReturnAlphabets {
	/*public static void main(String[] args) {
		String s="j::a::v::a";
		String s1="";
		for (int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if (Character.isAlphabetic(ch))
			{
				if (Character.isUpperCase(ch)||Character.isLowerCase(ch))
				{
					s1=s1+ch;
				}
			}
		}
		System.out.println(s1);
	}*/
	public static void returnAlphabets(String s) {
		String s1="";
		for (int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if (Character.isAlphabetic(ch))
			{
				if (Character.isUpperCase(ch)||Character.isLowerCase(ch))
				{
					s1=s1+ch;
				}
			}
		}
		System.out.println(s1);
	}
	public static void main(String[] args) {
		String s="j::a::v::a";
		returnAlphabets(s);
	}
}
