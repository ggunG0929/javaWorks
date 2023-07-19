package lambda;

@FunctionalInterface
public interface MyNumber {

	// 두 수의 대소를 비교하는 메서드
	int getMax(int x, int y);
}
