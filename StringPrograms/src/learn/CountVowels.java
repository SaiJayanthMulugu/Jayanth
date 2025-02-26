package learn;

public class CountVowels {
	public static boolean isEmpty(String s){
		if (s.length()==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void count(String s){
		String s1="";
		int countVowels=0;
		int countDigits=0;
		for (int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(Character.isAlphabetic(ch))
			{
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				{
					countVowels++;
				}
			}
			else if(Character.isDigit(ch))
			{
				countDigits++;
			}
		}
		System.out.println("count of digits :"+countDigits);
		System.out.println("count of vowels :"+countVowels);
	}
	public static void main(String[] args) {
		String s="lang123";
		if(isEmpty(s))
		{
			System.out.println("string is empty");
		}
		else
		{
			count(s);
		}
	}
}
