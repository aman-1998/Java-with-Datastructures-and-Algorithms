package designPatterns.creational.singleton;

public class Singleton_class_Multi_Thread_Env_N3 {
	public static void main(String[] args) {
		Singleton3 obj1 = Singleton3.getInstance();
		
		obj1.setConnection("Connection of database");
		String connection = obj1.getConnection();
		System.out.println(connection);
		
		Singleton3 obj2 = Singleton3.getInstance();
		System.out.println(obj2.getConnection());
	}
}

// For Multi-thread environment
/*
 * This is correct but here object will be created during class loading
 * So, even if we want or not there will be one object and when
 * getInstance() method is called reference to the already created 
 * object is returned.
 */
class Singleton3 {
	private static Singleton3 obj = new Singleton3();
	
	private Singleton3() {}
	
	public static Singleton3 getInstance() {
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
