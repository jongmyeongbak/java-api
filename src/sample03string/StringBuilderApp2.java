package sample03string;

public class StringBuilderApp2 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("홍길동");
		sb.append(", ");
		sb.append("1학년");
		sb.append(", ");
		sb.append("컴퓨터공학과");
		sb.append(", ");
		sb.append(100);
		sb.append(", ");
		sb.append(80);
		sb.append(", ");
		sb.append(100);
		
		System.out.println(sb);
	}
}
