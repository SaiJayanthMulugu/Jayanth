//WAPTP summation of ASCII values of the characters in a given string.
		//ex :"ABCD"

package learn;

public class SummationOfAscii {
	/*public static void main(String[] args) {
		String s="ABCD";
		int sum=0;
		for (int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			sum=sum+ch;
		}
		System.out.println(sum);
	}*/
	public static void ascii(String s) {
		int sum=0;
		for (int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			sum=sum+ch;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		String s="ABCD";
		ascii(s);
	}
}
