package sample03string;

import java.util.StringTokenizer;

public class StringTokenizerApp {

	public static void main(String[] args) {
		String text = "지난달 경기도 화성 동탄2신도시의 한 아파트를 5억원에 계약했다. 전세 만기가 다가와 계약 갱신도 고민했지만, 결국 아파트를 장만하기로 했다.";
		StringTokenizer tokenizer = new StringTokenizer(text);
		
		// 토큰화된 문자열 출력하기
		int count = 0;
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
//			System.out.println(token);
			if (token.contains("아파트")) {
				count++;
			}
		}
		System.out.println(count);
	}
}
