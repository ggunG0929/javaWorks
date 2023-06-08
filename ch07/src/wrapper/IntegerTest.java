package wrapper;

import java.util.ArrayList;

public class IntegerTest {

	public static void main(String[] args) {	// int랑 integer 차이가 뭐지??
		int num1 = 100;
		Integer num2 = 200;		// 자동 형변환(오토박싱)
		int sum;
		
		sum = num1 + num2.intValue();	// Integer -> int(언박싱)
		System.out.println(sum);
		
		// Integer.parseInt: 문자형 -> 정수형(int)으로 변환
		int num3 = Integer.parseInt("300");
		System.out.println(num3);
		
		// ValueOf() -> 정수형(integer)으로 변환
		Integer num4 = Integer.valueOf("400");
		System.out.println(num4);
		
		// 자료형으로 사용
		ArrayList<Integer> numberList = new ArrayList<>();	// arraylist ctrl+space
		numberList.add(10);
		numberList.add(20);
		numberList.add(30);
		
		// 0번 인덱스 요소 조회
		System.out.println(numberList.get(0));
		
		// 전체 요소 조회
		for(int i=0; i<numberList.size(); i++) {
			Integer number = numberList.get(i);
			System.out.println(number);
		}
		
		// 요소 변경(1번 인덱스를 50으로 변경)
		numberList.set(1, 50);
		
		// 향상 for문
//		for(Integer number : numberList) {
//			System.out.println(number);
//		}
		for(int number : numberList) {
			System.out.println(number);
		}
	}

}
