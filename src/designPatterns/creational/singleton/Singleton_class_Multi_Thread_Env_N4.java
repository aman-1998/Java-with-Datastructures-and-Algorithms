package designPatterns.creational.singleton;
/*
 * Usage : DB Connection, Logger Instance, Runtime objects in Java
 * 
 * When to use:
 * 1. When we need to create only one instance of the class in whole application.
 * And that instance is shared across different modules or pieces of code.
 * 2. When objects are heavy and creation of instances multiple times effects the performance.
 * 3. Object should not get modified in the course of application.
 * 
 */
public class Singleton_class_Multi_Thread_Env_N4 {
	public static void main(String[] args) {
		Singleton4 obj1 = Singleton4.getInstance();
		
		obj1.setConnection("Connection of database");
		String connection = obj1.getConnection();
		System.out.println(connection);
		
		Singleton4 obj2 = Singleton4.getInstance();
		System.out.println(obj2.getConnection());
	}
}

// For Multi-thread environment - This is the best way to design Singleton class for multi-thread env
class Singleton4 {
	private static Singleton4 obj = null;
	
	private Singleton4() {}
	
	public static Singleton4 getInstance() {
		if(obj == null) {
			synchronized (Singleton4.class) {
				if(obj == null) {
					obj = new Singleton4();
				}
			}
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
