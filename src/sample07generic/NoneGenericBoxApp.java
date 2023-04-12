package sample07generic;

public class NoneGenericBoxApp {

	public static void main(String[] args) {
		
		// 문자열을 담을 수 있는 NoneGenericBox객체 생성학
		NoneGenericBox box1 = new NoneGenericBox();
		box1.setItem("홍길동");
		
		String value = (String) box1.getItem();
		System.out.println("박스에 저장된 값: " + value);
	}
}
