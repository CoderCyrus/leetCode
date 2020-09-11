package palindromeNumber;

public class Main {
	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		boolean condition = palindrome.isPalindrome(0);
		System.out.println(condition);
	}
}
