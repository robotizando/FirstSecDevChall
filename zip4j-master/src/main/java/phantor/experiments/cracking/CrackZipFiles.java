package phantor.experiments.cracking;

import java.io.File;
import java.io.IOException;
import java.util.Vector;

import net.lingala.zip4j.ZipFile;

public class CrackZipFiles {

	protected File outputFolder;

	public static void main(String[] args) throws IOException {
			  
		  Integer maxSizeTest = 5;
		  
		  //open zip file
		  File filezip = getFileFromResources("/home/phantor/Trabalhos/Vee/desenvolvimento/zip4j-master/src/main/resources/texto.txt.zip");		  
		  
		  String []charset = { "1","2","3","4","5","6","7","8","9","0" };
		    
		  //generate permutations
          Vector<String> permutations = generatePermutations(maxSizeTest, charset);
		    
		    //test every combination
			for (int i = 0; i < permutations.size(); i++) {
			
				 String passwd = permutations.get(i).toString();
				 
    	  		   try {
		  			  
		  			   System.out.print( passwd );
		  			   
					   ZipFile zipFile = new ZipFile(filezip, passwd.toCharArray() );
					   zipFile.extractAll("/home/phantor/Trabalhos/Vee/desenvolvimento/zip4j-master/src/main/resources/output");
				   
					   System.out.println( " MATCH --- >>> " + passwd + " <<< ");
					   break;
					   
		  		   } catch (Exception e) {
		  			   
					   System.out.println( e.getMessage() );
					// TODO: handle exception
				   } finally {
				}
			}
	  }
	
	
	static Vector<String> generatePermutations(int X, String[] arr) {
		String[] ml = arr;

		Vector<String> response = new Vector<String>();
		
		return response;
	}

	
	
	public static File getFileFromResources(String fileName) {
		String path = fileName;
		return new File(fileName);
	}
}
