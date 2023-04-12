package sample07generic;

public class GenericWildCardApp {

	public static void main(String[] args) {
		/*
		 * 제네릭 와일드카드
		 * 	<?>
		 * 	<? extends 타입>
		 * 	<? super 타입>
		 * 	- 제네릭 와일드카드는 메서드의 매개변수, 메서드의 반환타입에 사용한다.
		 * 	- 클래스나 인터페이스의 타입 매개변수로 사용할 수 없다.
		 * 		public class Box<?> {
		 * 
		 * 		}
		 * 		public class Box<? extends 타입> {
		 * 
		 * 		}
		 * 		public class Box<? extends 타입> {
		 * 
		 * 		}
		 * 		모두 컴파일 오류다.
		 * 	<?>
		 * 		비한정적 와일드카드
		 * 	<? extends 타입>
		 * 		상한 경계 와일드카드
		 * 		상위 클래스를 제한한다.
		 * 	<? super 타입>
		 * 		하한 경계 와일드카드
		 * 		하위 클래스를 제한한다.
		 */
		
		// 배열
		Object[] arr1 = new Integer[10];
		System.out.println(arr1.getClass());
		
		// 제네릭클래스
		GenericBox<Integer> boxTest = new GenericBox<Integer>();
//		GenericBox<Object> boxTest2 = boxTest;
//		GenericBox<Object> box1 = new GenericBox<Integer>();
		
		test1(new GenericBox<String>());
		test1(new GenericBox<Integer>());
		test1(new GenericBox<Long>());
		test1(new GenericBox<Phone>());
		test1(new GenericBox<SmartPhone>());
		test1(new GenericBox<FeaturePhone>());
		test1(new GenericBox<>());
		test1(new GenericBox());
		
//		test2(new GenericBox<String>());
//		test2(new GenericBox<Integer>());
//		test2(new GenericBox<Long>());
		test2(new GenericBox<Phone>());
		test2(new GenericBox<SmartPhone>());
		test2(new GenericBox<FeaturePhone>());
		test2(new GenericBox<>());
		test2(new GenericBox());
		
//		test3(new GenericBox<String>());
		test3(new GenericBox<Integer>());
		test3(new GenericBox<Long>());
//		test3(new GenericBox<Phone>());
//		test3(new GenericBox<SmartPhone>());
//		test3(new GenericBox<FeaturePhone>());
		test3(new GenericBox<>());
		test3(new GenericBox());
		
//		test4(new GenericBox<String>());
//		test4(new GenericBox<Integer>());
//		test4(new GenericBox<Long>());
		test4(new GenericBox<Phone>());
		test4(new GenericBox<SmartPhone>());
//		test4(new GenericBox<FeaturePhone>());
		test4(new GenericBox<>());
		test4(new GenericBox());
	}
	
	// GenericBox객체의 타입 매개변수가 무엇이든 상관없다.
	public static void test1(GenericBox<?> box) {
		
	}
	
	// GenericBox객체의 타입 매개변수가 Phone 또는 그 하위 타입인 것만 전달 가능.
	public static void test2(GenericBox<? extends Phone> box) {
		
	}
	
	public static void test3(GenericBox<? extends Number> box) {
		
	}
	
	// GenericBox객체의 타입 매개변수가 SmartPhone 또는 그 상위 타입인 것만 전달 가능.
	public static void test4(GenericBox<? super SmartPhone> box) {
		
	}
}
