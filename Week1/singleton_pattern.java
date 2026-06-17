package week1;

public class singleton_pattern {
	private static singleton_pattern instance;
	private singleton_pattern() {
		System.out.println("Datatbase connection created");
	}
public static singleton_pattern getInstance() {
	if(instance == null) {
		instance = new singleton_pattern();
	}
	return instance;
}
public void connect()
{
	System.out.println("Connected Succcessfully");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singleton_pattern db1 =  singleton_pattern.getInstance();
		singleton_pattern db2 =  singleton_pattern.getInstance();
		db1.connect();
		System.out.println(db1==db2);

	}

}
