package interfaceex.scheduler;

public class PriorityAllocation implements Scheduler{	// add unimplemented methods

	@Override
	public void getNextCall() {
		System.out.println("등급이 높은 고객의 상담 전화를 먼저 가져오기");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무스킬이 높은 상담원에게 우선 배분합니다.");
	}

}
