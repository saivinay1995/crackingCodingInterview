package arrays;

public class StringCompression {
	
	public static void main(String[] args) {
		String s="aabcccccaaa ";
		int count=0;
		String unique=" ";
		for(int i=0;i<s.length()-1;i++)
		{
			count++;
			if(s.charAt(i)!=s.charAt(i+1))
			{
				unique=unique+s.charAt(i)+count;
				count=0;
			}
			
		}
		System.out.println(unique);
		
		
	}

}
