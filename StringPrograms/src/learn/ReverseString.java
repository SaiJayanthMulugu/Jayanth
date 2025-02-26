//WAPT reverse a string 
 //ex :"java"    "avaj"

package learn;

public class ReverseString {
	/*public static void main(String[] args) {
		String s="jaava";
		String rev="";
		for (int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
	}*/
	public static void reverse(String s) {
		String rev="";
		for (int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
	}
	public static void main(String[] args) {
		String s="javva";
		reverse(s);
	}
}
