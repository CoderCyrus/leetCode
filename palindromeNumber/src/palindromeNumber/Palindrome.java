package palindromeNumber;

public class Palindrome {

	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		} else {
			int reverseNumber = reverseInt(x);
			return x == reverseNumber;
		}
	}

	public int reverseInt(int x) {
		long res = 0;
		while (x != 0) {
			res = res * 10 + x % 10;
			x = x / 10;
		}
		return (int) res;
	}

}
