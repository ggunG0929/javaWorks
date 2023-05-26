package abstactex.animal;

public class AnimalMain {

	public static void main(String[] args) {
		// 고양이 객체 생성
//		Cat cat = new Cat();
		Animal cat = new Cat();		// 부모 타입으로 객체 생성(다형성)
		Animal dog = new Dog();
		
		cat.breathe();
		cat.showInfo();
//		cat.sound();
		
//		dog.sound();
		
		//animalSound() 호출
		animalSound(cat);
		animalSound(dog);
	}
	
	// 매개 변수의 다형성
	private static void animalSound(Animal animal) {
		animal.sound();
	}

}
