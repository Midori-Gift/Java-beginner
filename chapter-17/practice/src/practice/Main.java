package practice;

public class Main {

	public static void main(String[] args) {
		String s = new String();
		s = null;
		try {
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException例外をcatchしました");
			System.out.println("(ここから)--");
			e.printStackTrace();
			System.out.println("(ここまで)--");
		}
	}
}
