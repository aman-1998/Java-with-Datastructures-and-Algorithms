package aggregationAndComposition;

/*
 * Aggregation => has-a relation ship between parent and child
 * The association is weaker
 * 
 * Composition => has-a relationship but the association is stronger
 * So, for composition we can use part-of relationship between parent
 * and child
 */
public class Main_N1 
{
	public static void main(String[] args) {
		Address address = new Address("Salkia","Flat No 2B","29 Bhairab Dutta lane","Shree Satyabarayan Appartment");
		Student student = new Student("Aman",address);
		System.out.println(student);
	}
}
