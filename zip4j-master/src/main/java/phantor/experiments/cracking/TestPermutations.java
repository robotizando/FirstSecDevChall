package phantor.experiments.cracking;

import java.io.File;
import java.io.IOException;
import java.util.Vector;

public class TestPermutations {

	protected File outputFolder;

	public static void main(String[] args) throws IOException {
		  
		  String []charset = { "a", "b" };
		  Integer maxSizeTest = 2;
		  
		    // Given X 
		  Vector<String> permutations = generatePermutations(maxSizeTest, charset);
		    
		    //test every combination
			for (int i = 0; i < permutations.size(); i++) {
				 String passwd = permutations.get(i).toString();
                 System.out.print( passwd + " " );
			}
	  }

	
	
	
	static Vector<String> generatePermutations(int X, String[] arr) {
		String[] ml = arr;

		Vector<String> response = new Vector<String>();
		
		
		
		return response;
	}


}
