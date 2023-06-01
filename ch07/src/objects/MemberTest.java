package objects;

public class MemberTest {

	public static void main(String[] args) {
		
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		// 문자열 비교
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 일치합니다.");
		}else {
			System.out.println("obj1과 obj2는 다릅니다.");		// 결과: 다르다고 나옴 - 재정의 필요(hashcode, equals) - 이후에는 일치
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 일치합니다.");
		}else {
			System.out.println("obj1과 obj3는 다릅니다.");
		}
		
//		// 임의로 확인		// hashcode 재정의 후 2e305a, 2e305a, 1b891
//		System.out.println(obj1);	//objects.Member@626b2d4a -16진수 어쨌든 정수형
//		System.out.println(obj2);	//objects.Member@5e91993f
//		System.out.println(obj3);	//objects.Member@1c4af82c
//		System.out.println(System.identityHashCode(obj1));	// @뒤의 숫자가 해시코드는 아님!
	}

}
