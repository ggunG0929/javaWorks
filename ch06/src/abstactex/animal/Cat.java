package abstactex.animal;

public class Cat extends Animal{	// cat에서 unimplemented method add
	
	public Cat() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("야~옹!");
	}
	
}
