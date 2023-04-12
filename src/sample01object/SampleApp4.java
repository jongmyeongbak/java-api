package sample01object;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class SampleApp4 {

	public static void main(String[] args) {
		Sample sample = new Sample(100, "홍길동");
		
		Class<?> clazz = sample.getClass();
		
		System.out.println("클래스 전체 이름: " + clazz.getName());
		
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			String typeName = field.getType().getName();
			String name = field.getName();
			System.out.println(typeName + " " + name);
		}
		
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			String returnTypeName = method.getReturnType().getName();
			String methodName = method.getName();
			Parameter[] parameters = method.getParameters();
			System.out.println("메서드 정보: " + returnTypeName + " " + methodName + " " + Arrays.toString(parameters));
		}
	}
}
