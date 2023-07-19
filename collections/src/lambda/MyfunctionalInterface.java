package lambda;

@FunctionalInterface	// 추상메서드는 1개만 사용 가능(2개 이상이면 메서드 사용시 어떤 메서드인지 구분할 수 없기 때문)	// @: 오노테이션?
public interface MyfunctionalInterface {
	// 매개변수가 없는 함수
	public void method();
//	public void method2();
}
