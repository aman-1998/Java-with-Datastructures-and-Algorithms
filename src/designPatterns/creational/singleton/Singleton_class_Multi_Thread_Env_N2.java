package designPatterns.creational.singleton;

public class Singleton_class_Multi_Thread_Env_N2 {
	public static void main(String[] args) {
		Singleton2 obj1 = Singleton2.getInstance();
		
		obj1.setConnection("Connection of database");
		String connection = obj1.getConnection();
		System.out.println(connection);
		
		Singleton2 obj2 = Singleton2.getInstance();
		System.out.println(obj2.getConnection());
	}
}

// For Multi-thread environment - This is correct but less efficient as we are making the whole method synchronized.
class Singleton2 {
	private static Singleton2 obj = null;
	
	private Singleton2() {}
	
	synchronized public static Singleton2 getInstance() {
		if(obj == null) {
			obj = new Singleton2();
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
