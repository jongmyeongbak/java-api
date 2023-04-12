package sample10map;

import java.util.HashMap;
import java.util.Map;

public class MapApp2 {

	public static void main(String[] args) {
		// Map을 활용하여 if문을 제거하기
		Map<String, Double> map = new HashMap<>();
		map.put("gold", 0.05);
		map.put("silver", 0.02);
		map.put("bronze", 0.01);
		
		String grade = "silver";
		int amount = 1000000;
		
		double depositRate = map.get(grade);
		int point = (int) (amount * depositRate);
		System.out.println("적립포인트: " + point);
	}
}
