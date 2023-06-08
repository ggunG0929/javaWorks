package systems;

public class SystemTime {

	public static void main(String[] args) {
		// 수행시간 측정
		double start, end;
		start = System.currentTimeMillis();		// ms(1/1000)초로 계산
//		System.out.println(start);		// 시작 시간 출력
		
		long sum = 0;
		for(int i=1; i<10000000; i++) {
			sum += i;
		}
		end = System.currentTimeMillis();
		System.out.println("1부터 10,000,000까지 합: " + sum);
		System.out.printf("계산에 소요된 시간: %f초", (end-start)/1000);
	}

}
