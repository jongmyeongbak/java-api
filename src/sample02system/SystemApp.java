package sample02system;

import java.util.Enumeration;
import java.util.Set;

public class SystemApp {

	public static void main(String[] args) {
		long unixTime = System.currentTimeMillis();
		System.out.println(unixTime);

		String javaHome = System.getenv("JAVA_HOME");
		System.out.println(javaHome);

		System.out.println("##### 시스템 환경 변수 #####");
		Set<String> keys = System.getenv().keySet();
		for (String key : keys) {
			System.out.println("[" + key + "] -> [" + System.getenv(key) + "]");
		}
		System.out.println();

		// getProperty(시스템프로퍼티명) - 지정된 이름의 시스템프로퍼티값을 반환한다.
		System.out.println("##### 시스템 프로퍼티 값 #####");
		String fileSeperator = System.getProperty("file.separator");
		System.out.println("폴더구분문자: " + fileSeperator);
		System.out.println("줄바꿈문자: " + System.getProperty("line.separator"));
		// 줄바꿈문자
		System.out.println("줄바꿈문자: " + System.lineSeparator());
		
		Enumeration<Object> enumeration = System.getProperties().keys();
		while (enumeration.hasMoreElements()) {
			String key = (String) enumeration.nextElement();
			System.out.println("[" + key + "] -> [" + System.getProperty(key) + "]");
		}
	}
}
