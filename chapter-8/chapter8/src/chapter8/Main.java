package chapter8;

public class Main {
	public static void main(String[] args) {
		//		 勇者を生成
		Hero h = new Hero();
		//		  フィールドに初期値をセット
		h.name = "ミナト";
		h.Hp = 100;

//		お化けキノコを生成
		Matango m1 = new Matango();
		m1.Hp = 50;
		m1.suffix = 'A';

		System.out.println("勇者" + h.name + "生み出しました");
		//		  勇者を呼び出してゆく
		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();
}