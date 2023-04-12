package sample10map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		/*
		 * Properties
		 * 	- 프로퍼티 설정정보를 표현하는 객체다.
		 * 	- .properties 파일 혹은 .xml 파일에서 설정정보를 읽어오는 객체다.
		 * 	- 자바 애플리케이션의 설정정보를 로딩해 제공하는 객체다.
		 * 	- Properties객체는 Key와 Value으 타입이 모두 String 타입이다.
		 * 	- 주요 API
		 * 		void load(InputStream in)
		 * 			지정된 (File)InputStream으로 properties 파일 정보를 로딩한다.
		 * 		void load(Reader in)
		 * 			지정된 (File)InputReader로 properties 파일 정보를 로딩한다.
		 * 		void loadFromXML(InputStream in)
		 * 			지정된 (File)InputStream으로 properties 파일 정보를 로딩한다.
		 * 		String getProperty(String key)
		 * 			지정된 key값에 해당하는 프로퍼티정보를 반환한다.
		 * 		String getProperty(String key, String defaultValue)
		 * 			지정된 key값에 해당하는 프로퍼티정보를 반환한다. 존재하지 않으면 defaultValue가 반환된다.
		 */
		// .properties 파일을 읽어서 설정정보를 로드하는 객체다.
		Properties prop = new Properties();
//		prop.load(new FileInputStream("src/sample10map/sample.properties"));
		prop.loadFromXML(new FileInputStream("src/sample10map/sample.xml"));
		System.out.println(prop);
		
		String saveDirectory = prop.getProperty("file.upload.save.directory");
		System.out.println("첨부파일 저장경로: " + saveDirectory);
		long maxUploadFileSize = Long.parseLong(prop.getProperty("file.upload.maxuploadsize"));
		System.out.println("첨부파일 최대크기: " + maxUploadFileSize);
		String encoding = prop.getProperty("file.upload.encoding");
		System.out.println("인코딩 방식: " + encoding);
	}
}
