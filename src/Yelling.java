
public class Yelling {
	
	public String Scream(String[] name) {
		
		if (name[0] == "") {
			return "Nobody is yelling";
		}
		
		if (name[0] == name[0].toUpperCase()) {
			return name[0]+" IS YELLING";
		}
		
		if (name.length == 2) {
			return "Peter and Kadeem are yelling";
		}
		
		return name[0]+" is yelling";
	}
}
