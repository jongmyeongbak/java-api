package sample08list;

import java.util.ArrayList;

public class ArrayListApp1 {

	public static void main(String[] args) {
		
		// 배열과 ArrayList<E>의 비교
		String[] arr = new String[5];
		ArrayList<String> list = new ArrayList<>();
		
		// 배열객체에 문자열 저장하기
		arr[0] = "John";
		arr[1] = "Jane";
		arr[2] = "Alexandra";
		arr[3] = "Julia";
		arr[4] = "David";
		arr[5] = "Eddy";
		arr[6] = "Liz";
		
		// ArrayList객체에 문자열 저장하기
		list.add("John");
		list.add("Jane");
		list.add("Alexandra");
		list.add("Julia");
		list.add("David");
		list.add("Eddy");
		list.add("Liz");
		
		System.out.println("### 배열에 저장된 값 출력하기");
		for (Object value : arr) {
			if (value == null) {
				break;
			}
			System.out.println(value + " -> " + String.valueOf(value).toUpperCase());
		}
		System.out.println("###ArrayList객체에 저장된 값 출력하기");
		for (String value : list) {
			System.out.println(value + " -> " + value.toUpperCase());
		}
		
	}
}
