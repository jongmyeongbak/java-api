package sample03string;

public class StringBuilderApp {

	public static void main(String[] args) {
		System.out.println("### String객체에 문자열 추가하기");
		String str = "hello";
		System.out.println(str.hashCode());
		System.out.printf("%x\n",System.identityHashCode(str));
		str += " 홍길동";
		System.out.println(str.hashCode());
		System.out.printf("%x\n",System.identityHashCode(str));
		str += "님 반갑습니다.";
		System.out.println(str.hashCode());
		System.out.printf("%x\n",System.identityHashCode(str));
		System.out.println();
		
		System.out.println("### StringBuilder객체에 문자열 추가하기");
		StringBuilder sb = new StringBuilder("hello");
		System.out.println(sb.hashCode());
		System.out.printf("%x\n",System.identityHashCode(sb));
		sb.append("홍길동");
		System.out.println(sb.hashCode());
		System.out.printf("%x\n",System.identityHashCode(sb));
		sb.append("님 반갑습니다.");
		System.out.println(sb.hashCode());
		System.out.printf("%x\n",System.identityHashCode(sb));
	}
}
