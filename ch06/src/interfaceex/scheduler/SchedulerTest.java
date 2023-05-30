package interfaceex.scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
//		Scheduler roundRobin = new RoundRobin();
//		Scheduler leastJob = new LeastJob();
//		Scheduler priorityAllocation = new PriorityAllocation();
//		
//		roundRobin.getNextCall();
//		roundRobin.sendCallToAgent();
//		leastJob.getNextCall();
//		leastJob.sendCallToAgent();
//		priorityAllocation.getNextCall();
//		priorityAllocation.sendCallToAgent();
		
		// 객체 생성시 다형성 활용
//		Scheduler scheduler1 = new RoundRobin();
//		Scheduler scheduler2 = new LeastJob();
//		Scheduler scheduler3 = new PriorityAllocation();
//		
//		scheduler1.getNextCall();
//		scheduler1.sendCallToAgent();
//		scheduler2.getNextCall();
//		scheduler2.sendCallToAgent();
//		scheduler3.getNextCall();
//		scheduler3.sendCallToAgent();
		
		// 입력 방식 - System.in.read() (스캐너방식과 다름)
		System.out.println("전화 상담 배분 방식을 선택하세요.");
		System.out.println("R: 한명씩 차례로 배분");
		System.out.println("L: 현재 상담 업무가 없거나 대기가 가장 적은 상담원에게 배분");
		System.out.println("P: 우선 순위가 높은 고객부터 먼저 배분");
		int ch = System.in.read();	// read() 반환값이 int형이므로 char 쓰지 않음	// add throws declaration
		
		// 객체 생성시 다형성 활용
		Scheduler scheduler = null;
		
		if(ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		}else if(ch == 'L' || ch == 'l') {
			scheduler = new LeastJob();
		}else if(ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		}else {
			System.out.println("지원되지 않는 기능입니다.");
			return;		// 프로그램을 즉시 종료
		}
		
		scheduler.getNextCall();		// 중복을 줄이는 효과
		scheduler.sendCallToAgent();
//		System.out.println(ch);		// 임의로 출력해봄. 아스키 숫자로 나옴
	}

}
