
public class Yelling {
	
	public String Scream(String name) {
		
		if (name == null) {
			return "Nobody is yelling";
		}
		
		if (name == name.toUpperCase()) {
			return name+" IS YELLING";
		}
		
		return name+" is yelling";
	}
}
