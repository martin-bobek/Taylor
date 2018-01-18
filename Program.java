public class Program {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++)
			System.out.print(toUpper(args[i]) + ' ');
	}
	
	private static String toUpper(String str) {
		String upper = new String();
		for (int i = 0; i < str.length(); i++)
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
				upper += (char)(str.charAt(i) + 'A' - 'a');
			else
				upper += str.charAt(i);
		return upper;
	}
}