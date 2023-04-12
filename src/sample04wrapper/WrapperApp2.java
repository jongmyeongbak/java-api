package sample04wrapper;

public class WrapperApp2 {

	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		Integer x = new Integer(100);
		Integer y = Integer.valueOf(200);
		
		int a = x;
		int b = y;
	}
}
