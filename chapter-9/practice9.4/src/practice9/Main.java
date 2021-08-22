package practice9;

public class Main {
    public static void main(String[] args){
        Thief t1 = new Thief("ASAkA");
        Thief t2 = new Thief("Minato", 69);
        Thief t3 = new Thief(null, 40,30);
        System.out.println(t1.name);
        System.out.println(t2.name);
        System.out.println(t3.name);
    }
}
