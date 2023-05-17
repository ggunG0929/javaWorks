package forexample;

public class GugudanTest {

	public static void main(String[] args) {
		// 구구단
		
		for(int i=2; i<10; i++) {
			for(int j=1; j<=i; j++) {
				System.out.println(i + "X" + j + "= " + (i*j));
			}
			System.out.println();
		}

	}

}
