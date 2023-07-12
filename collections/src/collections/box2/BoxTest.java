package collections.box2;

public class BoxTest {

	public static void main(String[] args) {
		// 문자형 사용(예전 방식)
		Box box1 = new Box();
		box1.set("행운을 빌어요!");
//		String msg = box1.get();	// 다운캐스팅(강제 형변환)이 필요
		String msg = (String) box1.get();	// add cast to string
		System.out.println(msg);
	}

}
