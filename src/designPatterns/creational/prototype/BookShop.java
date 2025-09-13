package designPatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class BookShop implements Cloneable {
	
	private String shopName;
	private List<Book> listOfBooks = new ArrayList<>();

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public List<Book> getListOfBooks() {
		return listOfBooks;
	}

	public void setListOfBooks(List<Book> listOfBooks) {
		this.listOfBooks = listOfBooks;
	}
	
	@Override
	public String toString() {
		return "Shop Name: " + shopName + ",\nBooks: " + listOfBooks + "]";
	}

	/*
	 * In reality it should connect to database and loads data(book) from DB.
	 * But here, just for simplicity we are using loop and simulating the situation.
	 */
	public void bringBooksFromWareHouse() { 
		for(int i=0; i <= 10; i++) {
			Book book = new Book("Name"+(i+1), 300+i);
			this.listOfBooks.add(book);
		}
	}
	
//      Shallow cloning	
//		@Override
//		protected Object clone() throws CloneNotSupportedException {
//			return super.clone(); 
//		}

	
	// Deep cloning
	@Override
	protected Object clone() throws CloneNotSupportedException {
		BookShop shop = new BookShop();
		for(Book book : this.listOfBooks) {
			shop.getListOfBooks().add(book);
		}
		return shop;
	}
	
}
