package chapter8;

public class Hero {
	String name;
	int Hp;
//	状態：眠る(メソッド)
	public void sleep() {
		this.Hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}
//	状態:座る(メソッド)
	public void sit(int sec) {
		this.Hp += sec;
		System.out.println(this.name + "は、" +  sec + "秒座った！");
		System.out .println("HPが" + sec + "ポイント回復した。");
	}
//	状態:転ぶ(メソッド)
	public void slip() {
		this.Hp -= 5;
		System.out.println(this.name + "は、転んだ!");
		System.out.println("5のダメージ");
	}
//	状態:逃げる(メソッド)
	public void run() {
		System.out.println(this.name + "は、逃げ出した!");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.Hp + "でした");
	}
}
