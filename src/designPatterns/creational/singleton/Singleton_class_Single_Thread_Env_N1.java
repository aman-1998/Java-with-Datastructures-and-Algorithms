package designPatterns.creational.singleton;


public class Singleton_class_Single_Thread_Env_N1 {
	public static void main(String[] args) {
		Singleton1 obj1 = Singleton1.getInstance();
		
		obj1.setConnection("Connection of database");
		String connection = obj1.getConnection();
		System.out.println(connection);
		
		Singleton1 obj2 = Singleton1.getInstance();
		System.out.println(obj2.getConnection());
	}
}

// For Single thread environment
class Singleton1 {
	private static Singleton1 obj = null;
	
	private Singleton1() {}
	
	public static Singleton1 getInstance() {
		if(obj == null) {
			obj = new Singleton1();
		}
		return obj;
	}
	
	/*------------------------------------------------------*/
	
	// Additional informations just for example use
	private String connection;
	
	public String getConnection() {
		return connection;
	}
	
	public void setConnection(String connection) {
		this.connection = connection;
	}
}
