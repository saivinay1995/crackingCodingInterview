package arrays;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharactersString {
	
	public static void main(String[] args) {
		String s="abcdee";
		Map<Integer,Character> str=new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			int ascii=(int) s.charAt(i);
			if(str.get(ascii)==null)
				str.put(ascii, s.charAt(i));
			else
				System.out.println("repeated characters found");
		}
	}

}
