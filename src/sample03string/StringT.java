package sample03string;

import java.util.StringTokenizer;

public class StringT {

	public static void main(String[] args) {
		String text2 = "강감찬,,인턴,010-2222-2222";
		StringTokenizer st = new StringTokenizer(text2, ",", true);

		String[] splitText = new String[st.countTokens()];
		int i = 0;

		while (st.hasMoreTokens()) {
		    String token = st.nextToken();
		    if (token.equals(",")) {
		        splitText[i++] = "";
		    } else {
		        splitText[i++] = token;
		    }
		}

		// splitText 배열의 각 요소에 접근하여 출력합니다.
		System.out.println(splitText[0]); // "강감찬"
		System.out.println(splitText[1]); // ""
		System.out.println(splitText[2]); // "인턴"
		System.out.println(splitText[3]); // "010-2222-2222"
		
		String str = "1234";
		System.out.println(Integer.getInteger(str));
		System.out.println(Integer.valueOf("1234"));
	}
}
