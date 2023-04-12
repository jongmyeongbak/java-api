package sample04wrapper;

public class WrapperApp3 {

	public static void main(String[] args) {
		// Wrapper 클래스의 주요 API
		int num1 = Integer.parseInt("234");
		int num2 = Integer.parseInt("12");
		System.out.println(num1 * num2);
		
		// int Integer.parseInt(String text, int radix)
		int num3 = Integer.parseInt("1001", 2);
		System.out.println(num3);
		System.out.println(Integer.parseInt("1a", 16));
		
		String str1 = Integer.toBinaryString(-1);
		String str2 = Integer.toOctalString(54);
		String str3 = Integer.toHexString(54);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}
