package designPatterns.creational.singleton;

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
	
	synchronized public static Singleton4 getInstance() {
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
