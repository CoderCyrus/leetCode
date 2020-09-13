package romanToInteger;

public class RomanToInteger {

	int value(char r) {
		if (r == 'I')
			return 1;
		if (r == 'V')
			return 5;
		if (r == 'X')
			return 10;
		if (r == 'L')
			return 50;
		if (r == 'C')
			return 100;
		if (r == 'D')
			return 500;
		if (r == 'M')
			return 1000;
		return -1;
	}

	int romanToInteger(String s) {
		int res = 0;
		for (int i = 0; i < s.length(); i++) {
			int s1 = value(s.charAt(i));

			if (i + 1 < s.length()) {
				int s2 = value(s.charAt(i + 1));

				if (s2 > s1) {
					res = s2 - s1 + res;
					i++;
				} else
					res = s1 + res;
			}else res = res + s1;

		}
		return res;
	}

	public static void main(String args[]) {
		RomanToInteger ob = new RomanToInteger();

		// Considering inputs given are valid
		String str = "MCMIV";
		System.out.println("Integer form of Roman Numeral" + " is " + ob.romanToInteger(str));
	}
}
