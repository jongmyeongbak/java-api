package sample03string;

import java.util.Arrays;

public class StringApp3 {

	public static void main(String[] args) {
		// static String valueOf(Boolean b)
		// static String valueOf(char c)
		// static String valueOf(char[] arr, int offset, int length)
		// static String valueOf(double d)
		// static String valueOf(int i)
		// static String valueOf(long l)
		// static String valueOf(Object obj)
		String.valueOf(false);
		char[] chars2 = Character.toChars(122);
		System.out.println(Arrays.toString(chars2));
		// "true" -> true
		Boolean.parseBoolean("true");
		Boolean.valueOf("true");
		// "A" -> 'A'
		// "3.14" -> 3.14
		// "10000" -> 10000
		// "3000000000" -> 3000000000
		
		// 임의의 정수에 대하여 정수의 각 자리값을 더한 결과를 출력하기
		// 정수: 110293
		// 출력값: 16 = 1 + 1 + 2 + 9 + 3
		int number = 110293;
		String text = String.valueOf(number);
		String[] values = text.split("");
		int total = 0;
		for (String value : values) {
			total += Integer.parseInt(value);
		}
		System.out.println(total);
		
		char[] chars = String.valueOf(number).toCharArray();
		int sum = 0;
		for (char c : chars) {
			sum += Character.getNumericValue(c);
		}
		System.out.println(sum);
	}
}
