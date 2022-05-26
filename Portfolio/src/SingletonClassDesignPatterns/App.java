package SingletonClassDesignPatterns;

public class App {
	
	//Private Static Attribute called APP
	private static App app;
	
	
	//Private Constructor of the class, can't be acessed. 
	private App(){
		
	}
	
	//don't permit create more than one instance
	public static App getInstance() {
		if(app == null) {
			app = new App();
		}
		return app;
	}

}
