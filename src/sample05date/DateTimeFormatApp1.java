package sample05date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeFormatApp1 {

	public static void main(String[] args) {
		/*
		 * java.text.SimpleDateFormat
		 * 	- Date 자료형의 날짜와 시간정보를 지정한 형식의 문자열로 변환한다.
		 * 	- 날짜형식의 문자열을 해석하여 Date 자료형으로 변환한다.
		 * 
		 * 주요 API
		 * 	생성자
		 * 		SsimpleDateFormat(String pattern)
		 * 			지정도니 패턴으로 초기화된 SimpleDateFormat 객체를 생성한다.
		 * 	메서드
		 * 		String format(Date date)
		 * 			Date 객체의 날짜와 시간 정보를 지정된 패턴의 문자열로 변환한다.
		 * 		Date parse(String text)
		 * 			지정된 날짜형식으로 작성된 문자열을 Date 객체로 변환한다.
		 * 
		 * 	주요 패턴 문자
		 * 		y	년도
		 * 		M	월
		 * 		w	주
		 * 		d	일
		 * 		W	주수
		 * 		D	일수
		 * 		E	요일
		 * 		a	오전 또는 오후
		 * 		H	시(0 ~ 23)
		 * 		h	시(1 ~ 12)
		 * 		m	분
		 * 		s	초
		 * 		S	밀리초
		 */
		
		// 시스템의 현재 날짜와 시간정보를 표현하는 Date 객체 생성하기
		Date now = new Date(-62135800069999L-10000000*0);
		System.out.println("포매팅 하기 전: " + now);
		
		// 날짜와 시간 패턴 지정하기
//		String pattern = "yyyy-M-d EEEE";
//		String pattern = "HH:mm:ss";
//		String pattern = "a h시 m분 s초";
//		String pattern = "y-MM-dd HH:mm:ss";
		String pattern = "G y년 M월 d일 EEEE a h시 m분 s초";
		
		// SimpleDateForma 객체를 생성하고 패턴정보를 전달받아 초기화하기
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		// Date객체(날짜와 시간정보)를 지정된 패턴형식의 문자열로 변환하기
		String text = sdf.format(now);
		System.out.println("포매팅된 날짜와 시간정보: " + text);
	}
}
