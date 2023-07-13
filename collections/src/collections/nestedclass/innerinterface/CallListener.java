package collections.nestedclass.innerinterface;

public class CallListener implements Button.OnClickListener {	// add unimplemented

	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}

}
