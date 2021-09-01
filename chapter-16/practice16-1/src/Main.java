import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		  names.add("斎藤");
		  names.add("鈴木");
		  
		for(int i = 0; i < names.size(); i+=1) {
			System.out.println(names.get(i));
		}
	}
}
