package sample04wrapper;

public class WrapperApp1 {

	public static void main(String[] args) {
		Boolean a = true;
		Character b = 'A';
		Integer c = 10;
		Long d = 30000L;
		Double e = 3.14;
		
		Object a1 = true;
		Object b1 = 'A';
		Object c1 = 10;
		Object d1 = 10000L;
		Object e1 = 3.14;
		System.out.println(d.getClass());
		System.out.println(b.toString());
		
		char[] cs = {48, 49};
		String s = String.valueOf(cs);
		System.out.println(s);
		Dog bbbb = new Poodle();
		bbbb.play();
	}
}
class Animal {
    public void play() {
        System.out.println("The animal is playing.");
    }
}

class Dog extends Animal {
    // ...
}

class Poodle extends Dog {
	public void play() {
		System.out.println("The poodle is playing.");
	}
}