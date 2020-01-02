package arrays;

public class StringCompression {
	
	public static void main(String[] args) {
		String s="aabcccccaa";
		char temp=' ';
		int count=0;
		String unique=" ";
		for(int i=0;i<s.length();i++)
		{
			if(!unique.contains(s.charAt(i)+""))
			{
				unique=unique+s.charAt(i);
			}
		}
		
		
	}

}
