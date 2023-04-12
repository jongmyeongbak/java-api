package sample03string;

public class StringApp1 {

	public static void main(String[] args) {
		
		String str3 = new String("홍");
		String str1 = "홍";
		
		System.out.println(System.identityHashCode(str3.toString()));
		System.out.println(System.identityHashCode(str1));
		
		System.out.println(new String().isEmpty());
		System.out.println("".isEmpty());
		System.out.println("   ".isEmpty());
		System.out.println("".isBlank());
		System.out.println("   ".isBlank());
		
		String str9 = "가나다나다라   ";
		System.out.println(str9.lastIndexOf("나다", 3));
		
		System.out.println(str9.charAt(3));
		
		System.out.println();
		String[] arr1 = str9.split("");
		for(String str : arr1) {
			System.out.println(str);
		}
		System.out.println("end");
		
		String str7 = "http://www.daum.net";
		String str8 = "localhost/index.html";
		boolean result1 = str7.startsWith("http");
		boolean result2 = str8.startsWith("http");
		System.out.println(result1);
		System.out.println(result2);
		
		System.out.println(str7.endsWith(""));
		
		String str13 = "홍길동의 집 전화번호는 02-111-1111이고, 휴대폰 번호는 010-2222-2222번이다.";
		String str14 = str13.replaceAll("-\\d{3,4}-", "-****-");
		System.out.println(str14);
	}
}
