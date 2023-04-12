package sample10map;

import java.util.HashMap;
import java.util.Map;

public class MapApp4 {

	public static void main(String[] args) {
		// Map을 이용하여 변화가 많은 정보를 저장할 수 있다.
		
		// Map객체를 이용하여 다양한 검색조건 정보를 저장할 수 있다. ex) 게시판 정렬
		/*
		 * Map객체를 이용하여 다양한 정보를 저장한 Value Object(사실은 DTO)처럼 사용하기
		 * 	- 저장할 정보의 항목이 매우 다양하고, 변화가 많은 경우
		 * 	- 하나의 정보를 매우 다양한 형식으로 표현해야 하는 경우
		 * 
		 * Map객체를 이용할 때 주의할 내용
		 * 	- key 값이 문자열인 경우가 많은데, 오탈자 체크가 되지 않는다.
		 */
		Map<String, Object> map = new HashMap<>();
		map.put("sort", "price"); // 정렬기준
		map.put("row", 20); // 출력개수
		map.put("search-opt", "title"); // 검색옵션
		map.put("searchKeyword", "토익시험"); // 검색키워드
		map.put("minPrice", 15000);
		map.put("maxPrice", 30000);
		map.put("pageNo", 2);
		int value2 = (Integer) map.get("sort");
		System.out.println(value2);
	}
}
