package designPatterns.creational.prototype;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		BookShop shop1 = new BookShop();
		shop1.setShopName("Shyam Stationary");
		shop1.bringBooksFromWareHouse();
		System.out.println(shop1);
		
		System.out.println("----------------------------------------------------------");
		
//		BookShop shop2 = new BookShop();
//		shop2.setShopName("Nandi Stationary");
//		shop2.bringBooksFromWareHouse();
//		System.out.println(shop2);
		
		
		
//		BookShop shop2 = (BookShop)shop1.clone();  // shallow cloning
//		
//		shop1.getListOfBooks().set(0, new Book("XYZ", 400));
//		
//		shop2.setShopName("Nandi Stationary");
//		System.out.println(shop2);
		
		
		BookShop shop2 = (BookShop)shop1.clone(); // deep cloning
		
		shop1.getListOfBooks().set(0, new Book("XYZ", 400));
		
		shop2.setShopName("Nandi Stationary");
		System.out.println(shop2);
	}
}
