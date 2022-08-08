package designPatterns.creational.prototype;

public class Book {
	private String bookName;
	private int cost;
	
	public Book(String bookName, int cost) {
		this.bookName = bookName;
		this.cost = cost;
	}

	public String getBookName() {
		return bookName;
	}

	public int getCost() {
		return cost;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", cost=" + cost + "]";
	}
	
}
