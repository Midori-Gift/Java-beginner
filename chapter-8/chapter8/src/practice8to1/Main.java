package practice8to1;

public class Main {
	public static void main(String[] args) {
		Cleric c = new Cleric();
		c.name = "聖職者";
		System.out.println("職業:" + c.name );
		
		c.selfAid();
		c.selfAid();
		c.selfAid();
	}
}
