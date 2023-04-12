package sample01object;

import java.util.Objects;

import javax.management.RuntimeErrorException;

/*
 * Sample은 Object를 상속받은 클래스
 * 	- Object 클래스에 정의된 메서드를 상속받는다.
 * 		* public Class<?> getClass() { ... }
 * 		* public boolean equals(Object obj) { ... }
 * 		* public int hashCode() { ... }
 * 		* public String toString() { ... }
 * 		* protected Object clone() { ... }
 */
public class Sample implements Cloneable {

	private int no;
	private String name;
	
	public Sample() {}
	
	public Sample(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, no);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sample other = (Sample) obj;
		return Objects.equals(name, other.name) && no == other.no;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// 1. copy()를 정의
	public Sample copy() {
		try {
//			Object obj = clone();
			return (Sample) clone();
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}
	
	// 2. clone()을 재정의
//	public Sample clone() {
////		Sample sample = null;
//		try {
//			return (Sample) super.clone();
//		} catch (CloneNotSupportedException e) {
//			throw new RuntimeException(e);
//		}
////		return sample;
//	}

	/*
	 * Object의 toString() 메서드 재정의하기
	 */
//	@Override
//	public String toString() {
//		return "Sample [no=" + no + ", name=" + name + "]";
//	}

//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return super.clone();
//	}
//	
	protected void method() {
		System.out.println("protected");
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Sample sample = new Sample(100, "홍길동");
		Sample sample2 = new Sample(200, "김유신");
		
//		// String toString() 메서드를 실행하여 객체에 대한 간단한 정보를 반환받을 수 있다.
//		System.out.println("toStriong(): " + sample.toString());
//		System.out.println("toStriong(): " + sample);
		
//		sample.setNo(1);
		Sample sample999 = (Sample) sample.clone();
	}
	
}
