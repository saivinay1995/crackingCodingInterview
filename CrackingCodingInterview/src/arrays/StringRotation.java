package arrays;

public class StringRotation {

	public static void main(String[] args) {


		String s="waterBottle";
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.substring(i)+s.substring(0, i));
			
		}
	}
}
