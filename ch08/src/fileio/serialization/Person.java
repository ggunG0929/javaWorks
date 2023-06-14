package fileio.serialization;

import java.io.Serializable;

public class Person implements Serializable{	// add default serial id	// import

	private static final long serialVersionUID = 10L;
	
	// 필드
	String name;
	String job;
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	@Override	// 우클>src>override
	public String toString() {
		return name + ", " + job;
	}

}
