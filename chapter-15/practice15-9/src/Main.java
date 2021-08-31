
public class Main {
	public static void main(String[] args) {
		int n = 0;
		StringBuilder s = new StringBuilder();
		for(int i = 0; i<100; i++) {
			n += 1;
			s.append(n + ",");
		}

		String a = s.toString();
		String[] a = s.split(",");
		System.out.println(a);
	}
}
