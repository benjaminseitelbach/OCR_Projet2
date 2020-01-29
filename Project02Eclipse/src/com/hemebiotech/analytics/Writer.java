package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Writer implements IWriter {
	
	private String filePath; //Supprimer et utiliser directement Config.filePath ?
	private Map<String, Integer> result;
	
	/**
	 *  @param filepath result filepath
	 *  @param result a map with a String as key which corresponds to the symptom
	 *  and an Integer as value which corresponds to the counter of the corresponding symptom
	 */
	 	
	public Writer(Map<String, Integer> result) {
		this.filePath = Config.resultFilePath;
		this.result = result;
	}
	
	@Override
	public void write() {

		if(this.filePath != null ) {
			try {
				
				FileWriter writer = new FileWriter (this.filePath);
				Set<Entry<String, Integer>> setHm = this.result.entrySet();

			    Iterator<Entry<String, Integer>> it = setHm.iterator();
			    
			    //Loop on keys(symptoms)
			    while(it.hasNext()){
			    	
			    	//Get entry
			        Entry<String, Integer> e = it.next();
			        
			        //Line which will be written in the result file (symptom : counter)
			        String line = e.getKey() + " : " + e.getValue() + "\n";
			         
			        //Write line in result file
			        writer.write(line);
			        
			    }

				//File closing
				writer.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
