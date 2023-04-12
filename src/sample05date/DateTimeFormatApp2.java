package sample05date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeFormatApp2 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		
		// 지정된 패턴형식의 문자열을 해것하여 Date 객체를 생성하기
		Date date1 = sdf1.parse("2023-1-001");
		System.out.println(date1);
		
		Date now = new Date();
		
		long nowUnixTime = now.getTime();
		long dateUnixTime = date1.getTime();
		System.out.println((nowUnixTime - dateUnixTime) / (60 * 60 * 24 * 1000));
	}
}
