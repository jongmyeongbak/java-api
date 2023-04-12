package sample06math;

/*
 * 정적 import 구문
 * 	- static 변수, static 메서드, static 클래스를 import시킨다.
 */
//import static java.lang.Math.abs;
//import static java.lang.Math.max;
//import static java.lang.Math.min;
//import static java.lang.Math.round;
//import static java.lang.Math.ceil;
//import static java.lang.Math.floor;

public class MathApp1 {
	
	public static void main(String[] args) {
		// Math 클래스의 주요 메서드
		
		// 절댓값을 반환하는 메서드
//	abs(a)
		
		// 큰 값을 반환하는 메서드
		
		// 작은 값을 반환하는 메서드
		
		// 반올림된 값을 반환하는 메서드
//		long value11 = Math.round(3.14);
		
		// 천장값을 반환하는 메서드
		
		// 바닥값을 반환하는 메서드
		
		System.out.println(2/2); // 1
		System.out.println(-2/-2); // 1
		System.out.println(Math.floorDiv(2, 2)); // 1
		System.out.println(Math.floorDiv(-2, -2)); // 1
		System.out.println(-2/2); // -1
		System.out.println(2/-2); // -1
		System.out.println(Math.floorDiv(-2, 2)); // -1
		System.out.println(Math.floorDiv(2, -2)); // -1
		System.out.println();
		
		System.out.println(3/2); // 1
		System.out.println(-3/-2); // 1
		System.out.println(Math.floorDiv(3, 2)); // 1
		System.out.println(Math.floorDiv(-3, -2)); // 1 
		System.out.println(-3/2); // -1
		System.out.println(3/-2); // -1
		System.out.println(Math.floorDiv(-3, 2)); // -2
		System.out.println(Math.floorDiv(3, -2)); // -2
	}
}
