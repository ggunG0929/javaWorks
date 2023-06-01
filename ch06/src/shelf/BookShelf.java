package shelf;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);		// 처음항목 삭제 - 선입선출
	}

	@Override
	public int getSize() {
		return shelf.size();
	}

}
