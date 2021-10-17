import java.util.Random;


public class Cleric {
	String name;
	int hp = 50;
	final int HP = 50;

	int mp = 10;
	final int MP = 10;

	public void selfAid() {
		if (this.mp >= 5) {
		this.mp -= 5;
		this.hp = HP;
		System.out.println("セルフエイドを唱えた！");
		System.out.println("Hpが最大値まで回復した");
		} else {
		System.out.println("mpが足りません");
		}
	}

	public void pray(int sec) {

		int recover = new Random().nextInt(3) + sec;

		this.mp += sec + recover;
		if (this.mp >= MP) {
			this.mp = MP;
		}
		System.out.println("聖職者が祈る!");
		System.out.println("MPが" + sec + recover + "回復した");
	}
}
