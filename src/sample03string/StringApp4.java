package sample03string;

public class StringApp4 {

	public static void main(String[] args) {
		
		String[] emailArr = {"hong@email.com", "lee-sushin@naver.com", "kymys@hanmail.com"};
		
		// 고객의 이메일주소에서 아이디만 조회하여 출력하기
		for (String email : emailArr) {
			System.out.println(email.substring(0, email.indexOf('@')));
		}
		System.out.println();
		
		// 고객의 이메일주소에서 도메인네임 출력하기
		for (String email : emailArr) {
			System.out.println(email.substring(email.indexOf('@') + 1));
		}
	}
}
