package sample08list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListApp3 {

	public static void main(String[] args) {
		// ArrayList객체의 주요 API
		
		// List객체 생성하기
		Set<String> list1 = new HashSet<>();
		List<String> list2 = new ArrayList<>();
		Set<String> list3 = Set.of("john", "eddy", "adam", "jane");
		
		// List객체에 객체 추가하기
		System.out.println(list1.add("김유신"));;
		System.out.println(list1.add("강감찬"));;
		System.out.println(list1.add("강감찬"));;
		list1.add("이순신");
		list1.add("강감찬");
		list1.add("류관순");
		list1.add("안중근");
		
		list3 = new HashSet(list3);
		list3.add("alexsandra");
		for (String s : list3) {
			System.out.println(s);
		}
		
		// List객체에 저장된 객체의 개수를 조회하기
		int len = list1.size();
		System.out.println("List객체에 저장된 객체의 개수: " + len);
		
		// List객체가 비어있는지 조회하기
		System.out.println("첫 번째 List객체 비어있는가?: " + list1.isEmpty());
		System.out.println("두 번째 List객체 비어있는가?: " + list2.isEmpty());
		
		// List객체의 모든 객체 삭제하기
		list1.clear();
		len = list1.size();
		System.out.println("List객체에 저장된 객체의 개수: " + len);
	}
}
