package classes;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// String 클래스의 여러 가지 정보
		Class class1 = Class.forName("java.lang.String");	// add throws declaration
//		Class class1 = Class.forName("java.lang.StringBuilder");	// 필드정보가 훨씬 적음
		System.out.println(class1.getName());
		
		System.out.println();
		System.out.println("******** 생성자 정보 ********");
		Constructor<?>[] cons = class1.getConstructors();	// constructor import
		for(Constructor<?> con : cons) {
			System.out.println(con);
		}
		
		System.out.println();
		System.out.println("******** 필드 정보 ********");
		Field[] fields = class1.getDeclaredFields();		// field import
		for(Field field : fields) {
			System.out.println(field);
		}
		
		System.out.println();
		System.out.println("******** 메서드 정보 ********");
		Method[] methods = class1.getMethods();				// method import
		for(Method method : methods) {
			System.out.println(method);
		}
	}

}
