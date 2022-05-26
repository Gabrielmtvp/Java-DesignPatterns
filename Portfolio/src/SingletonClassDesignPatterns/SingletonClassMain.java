package SingletonClassDesignPatterns;

public class SingletonClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		App app = App.getInstance();
		App app1 = App.getInstance();
		
		System.out.println(app == app1);
	}

}
