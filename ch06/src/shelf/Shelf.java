package shelf;

import java.util.ArrayList;

public class Shelf {
	// 자료 구조(물리적) - ArrayList
//	private ArrayList<String> shelf;	// import arraylist java.util	// 상속해야 되니까 private -> protected
	protected ArrayList<String> shelf;
	
	public Shelf() {
		shelf = new ArrayList<>();
	}
	
	public ArrayList<String> getShelf() {
		return shelf;
	}
}
