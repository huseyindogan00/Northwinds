package kodlamaio.northwind.core.utilities.results;

public class Result {
	
	private boolean success;
	private String message; 
	
	public Result(boolean success) {
		this.success = success;
	}
	
	public Result(boolean success, String message ) {
		this(success);  // this() ile bu classın constractorını çağırmış oluyoruz ve parametre olarak gelen success değerini veriyoruz. 
		this.message = message;
		
	}
	public Result(String message) {
		this.message = message;
	}
	
	public boolean isSuccess() {
		return this.success;
	}
	
	public String getMessage() {
		return this.message;
	}
	
}
