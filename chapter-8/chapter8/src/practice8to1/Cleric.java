package practice8to1;

public class Cleric {
	String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;

	public void selfAid() {
		System.out.println("セルフエイドを唱えた!");
		if(this.mp < 4) {
			System.out.println("がMP不足...");
		}else {
		this.mp -= 5;
		this.hp = MAX_HP;

		System.out.println("HPが全回復した!" + "  " + "HP:" + this.hp);
		System.out.println("残りMP:" + this.mp);
		}
	}

	public void pray(int sec) {
		int r = new java.util.Random().nextInt(3);
		int sec = 3;
		this.mp += sec + r;
		if(mp > MAX_MP) {
			this.mp = 10;
		}
		
	}
}
