package learn;
public class WordsInOddIndex {
/*public class WordsInOddIndex {
	public static void main(String[] args) {
		String c="I Am Intresed In Java Development";
		String s[]=c.split(" ");
		//String d="";
		for (int i=0;i<=s.length-1;i++)
		{
			if (i%2==1)
			{
				System.out.println(s[i]);
			}
		}
		
	}*/
	public static boolean isEmpty(String s) {
		if(s.length()==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void string(String s) {
		String []s1=s.split(" ");
		for (int i=0;i<s.length()-1;i++)
		{
			if(i%2==1)
			{
				System.out.println(s1[i]);
			}
		}
	}
    public static void main(String[] args) {
		String s="This method takes a sentence and splits it into words, returning an array of words.";
		if(isEmpty(s))
		{
			System.out.println("string is empty");
		}
		else
		{
			string(s);
		}
	}
}


