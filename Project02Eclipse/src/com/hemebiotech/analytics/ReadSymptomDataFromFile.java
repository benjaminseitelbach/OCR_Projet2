package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filePath; //Supprimer et utiliser directement Config.filePath ?
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	
	public ReadSymptomDataFromFile () {
		this.filePath = Config.sourceFilePath;
	}
	
	@Override
	public List<String> getSymptoms() {
		List<String> result = new ArrayList<>();
		
		if (this.filePath != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(this.filePath));
				
				String line = reader.readLine();
				
				//Loop on all file
				while (line != null) {
					
					//Add line to the list
					result.add(line);
					
					line = reader.readLine();	// get another symptom
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
	

}