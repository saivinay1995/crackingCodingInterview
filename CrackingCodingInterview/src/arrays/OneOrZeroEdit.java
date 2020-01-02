package arrays;

public class OneOrZeroEdit {

	public static void main(String[] args) {
		String s="pale";
		String ss="pal";
		int sums=0;
		int sumss=0;
		if(s.length()-ss.length()!=1)
		{
			System.out.println(false);
		}
		else {
			for(int i=0;i<s.length();i++)
			{
				sums=sums+s.charAt(i);
			}
			for(int i=0;i<ss.length();i++)
			{
				sumss=sumss+ss.charAt(i);
			}
		}
		
		System.out.println(sums-sumss);//if subtraction result lies b/w 65 to 122 A to Z and a to z
	}

}
