package stream;

public class Student {

	private String name;
	private int score;
	
	// 우클>source>generate constructor using fields
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	// 우클>source>getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

}
