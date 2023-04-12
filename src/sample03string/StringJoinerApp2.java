package sample03string;

import java.util.StringJoiner;

public class StringJoinerApp2 {

	public static void main(String[] args) {
		String[] names = {"김유신", "강감찬", "이순신"};
		
		StringJoiner joiner = new StringJoiner(",");
		for (String x : names) {
			joiner.add(x);
		}
		System.out.println(joiner);
	}
}
