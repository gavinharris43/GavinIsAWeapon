
public class ReverseString {
	
	public ReverseString() {
		
	}

	
	public String reverseString(String input) {
		String output="";

		for(int i=0;i<input.length();i++) {
			output= input.charAt(i)+ output;
			
		}
		return output; 
		// TODO Auto-generated constructor stub
	}

}
