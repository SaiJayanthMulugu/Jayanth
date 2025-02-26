//WAPT count number of digits and number of alphabets present in given string 
	//ex : "jsp123"

package learn;

public class CountString {
	/*public static void main(String[] args) {
		String s="jspge123";
		int number=0;
		int letters=0;
		for (int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if (ch>='0' && ch<='9')
			{
				number++;
			}
			else if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
			{
				letters++;
			}
		}
		System.out.println("count of numbers are : "+number);
		System.out.println("count of letters are : "+letters);
	}*/
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
	public static void count(String s)
	{
		int number=0;
		int letters=0;
		for (int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if (ch>='0' && ch<='9')
			{
				number++;
			}
			else if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
			{
				letters++;
			}
		}
		System.out.println("count of numbers are : "+number);
		System.out.println("count of letters are : "+letters);
	}
	public static void main(String[] args) {
		String s="jspge123";
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
