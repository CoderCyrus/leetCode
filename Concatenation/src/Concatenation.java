
public class Concatenation {

	public String link(String... strings) {
		String result = "";
		if (strings == null) {
			throw new IllegalArgumentException("The enterred list is null");
		} else {
			for (String str : strings)
				result += str;
			return result;
		}
	}

	public static void main(String[] args) {
		Concatenation test = new Concatenation();
		System.out.println(test.link());
	}
}
