
public class Main {
	public static void main(String[] args) {
		int n = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<100; i++) {
			n += 1;
			sb.append(n + ",");
		}
		
		String s = sb.toString();
		System.out.println(s);
	}
}
