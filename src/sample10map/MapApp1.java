package sample10map;

import java.util.HashMap;

public class MapApp1 {

	public static void main(String[] args) {
		
		// HashMap객체로 정보 저장하기
		// key: 사용자아이디, value: 사용자이름
		HashMap<String, String> map = new HashMap<>();
		
		map.put("kim", "김유신");
		map.put("kang", "강감찬");
		map.put("lee", "이순신");
		map.put("ryu", "류관순");
		map.put("ahn", "안중근");
		
		String value1 = map.get("kim");
		System.out.println("조회된 값: " + value1);
		String value2 = map.get("hong");
		System.out.println("조회된 값: " + value2);
		
		map.remove("kim");
		map.remove("hong");
	}
}
