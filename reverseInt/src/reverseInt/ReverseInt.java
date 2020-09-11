package reverseInt;

public class ReverseInt {

	public int reverse(int x) {
		long res = 0;
		while (x != 0) {
			res = res * 10 + x % 10;
			x = x / 10;
		}

		//边缘检测
		if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
			return 0;
		} else
			return (int) res;
	}
}
