package sample03string;

import java.util.StringTokenizer;

public class StringTokenizerApp2 {

	public static void main(String[] args) {
		// String.split VS StringTokenizer
		String text1 = "김유신,영업2팀,과장,010-1111-1111";
		String text2 = "강감찬,,인턴,010-2222-2222";
		
		System.out.println("### split");
		String[] value1 = text1.split(",");
		String[] value2 = text2.split(",");
		System.out.println(value1.length);
		System.out.println(value2.length);
		
		System.out.println("### StringTokenizer");
		StringTokenizer tokenizer1 = new StringTokenizer(text1, ",");
		StringTokenizer tokenizer2 = new StringTokenizer(text2, ",");
		System.out.println(tokenizer1.countTokens());
		System.out.println(tokenizer2.countTokens());
	}
}
