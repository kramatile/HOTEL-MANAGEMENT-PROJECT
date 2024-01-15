package beans;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import forms.LabeledTextField;

public class FileManager {
	static public void Client(List<String>tab) {
		try {
			FileWriter myWriter;
			myWriter = new FileWriter("client.txt",true);
			for( String l :tab) {
				
			
			
			 myWriter.write(l+" ");
			 
			 
		     
		      System.out.println("Successfully wrote to the file.");
		}
			myWriter.write(System.getProperty("line.separator"));
			myWriter.close();} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
