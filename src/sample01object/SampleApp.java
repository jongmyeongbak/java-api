package sample01object;

public class SampleApp extends Sample {

//	void m() {
//		Sample sample = new Sample();
////		sample.clone();
//	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Sample sample = new Sample(100, "홍길동");
		Sample sample2 = new Sample(200, "김유신");
		
		// String toString() 메서드를 실행하여 객체에 대한 간단한 정보를 반환받을 수 있다.
		System.out.println("toStriong(): " + sample.toString());
		System.out.println("toStriong(): " + sample);
		
//		sample.setNo(1);
//		Sample sample999 = (Sample) sample.clone();
//		sample.setNo(2);
//		System.out.println(sample999);
		
		int hash = sample.hashCode();
		int hash2 = sample2.hashCode();
		System.out.println("해시코드: " + hash);
		System.out.printf("해시코드: %x\r\n" , hash);
	}
}
