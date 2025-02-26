//WAPTC the given string is palindrome or not.
package learn;

public class PalindromeString {
	/*public static void main(String[] args) {
		String s="malayalam";
		String srev="";
		for (int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			srev=srev+ch;
		}
		if(s.equals(srev))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("no");
		}
		System.out.println(srev);
	}*/
	public static void palindrome(String s) {
		String srev="";
		for (int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			srev=srev+ch;
		}
		if(s.equals(srev))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("no");
		}
		System.out.println(srev);
	}
	public static void main(String[] args) {
		String s="malayalam";
		palindrome(s);
	}
}
