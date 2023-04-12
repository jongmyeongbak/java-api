package sample10map;

import java.util.HashMap;
import java.util.Map;

public class MapApp3 {

	public static void main(String[] args) {
		// 이름 첫글자(성)별 학생수 집계
		String[] names = {"홍길동", "김유신", "강감찬", "이순신", "이이", "이황", "김춘추", "안중근", "안창호", "윤봉길", "김좌진", "이성계", "김구"};
		
		Map<Character, Integer> map = new HashMap<>();
		
		for (String name : names) {
			char familyName = name.charAt(0);
			if (map.containsKey(familyName)) {
				map.put(familyName, map.get(familyName) + 1);
			} else {
				map.put(familyName, 1);
			}
		}
		
		System.out.println(map);
	}
}
