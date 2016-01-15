package recursion;
public class palindrom {
	
	public static boolean isPalindorme(String text) {
		
		if (text.length()<=1) {
			return true;
		}
	}

	char first = Character.toLowerCase(text.charAt(0));
	char last = Character.toLowerCase(text.charAt(text.lengh()-1));
	
	if(Character.isLetter(first) && Character.isLetter(last)) {
}}

