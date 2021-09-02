import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		//	自作
//		try {
//			var fw = new FileWriter("data.txt");
//		} catch (IOException e) {
//			System.out.println("お手上げです");
//		}
// 正解
	System.out.println("プログラムが起動しました。");
	throw new IOException();
	}
}
