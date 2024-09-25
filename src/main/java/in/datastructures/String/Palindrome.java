package in.datastructures.String;

public class Palindrome {
	
	private String word;
	
	public boolean isPalindrome(String word) {
		char[] charArray = word.toCharArray();
		int start = 0;
		int end = word.length()-1;
		while(start<end) {
			if(charArray[start] != charArray[end]) {
			return false;
		}
		start ++;
		end--;
		}
		return true;
	
}	
	public static void main(String[] args) { 
		Palindrome ispalindrome = new Palindrome();
		if(ispalindrome.isPalindrome("nayan")) {
			System.out.println("The word is Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}

}
