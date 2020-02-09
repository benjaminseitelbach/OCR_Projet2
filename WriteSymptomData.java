package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class WriteSymptomData implements ISymptomWriter {
	
	private Map<String, Integer> result;
	
	/**
	 *  @param filepath result filepath
	 *  @param result a map with a String as key which corresponds to the symptom
	 *  and an Integer as value which corresponds to the counter of the corresponding symptom
	 */
	 	
	public WriteSymptomData(Map<String, Integer> result) {
		this.result = result;
	}
	
	@Override
	public void write() throws NoFilePathException {

		if(Config.RESULTFILEPATH != "") {
			try {
				
				FileWriter writer = new FileWriter (Config.RESULTFILEPATH);
				Set<Entry<String, Integer>> setHm = this.result.entrySet();

			    Iterator<Entry<String, Integer>> it = setHm.iterator();
			    
			    while(it.hasNext()){
			    	
			    	//Get entry
			        Entry<String, Integer> e = it.next();
			        
			        //Line which will be written in the result file (symptom : counter)
			        String line = e.getKey() + " : " + e.getValue() + "\n";
			         
			        writer.write(line);
			        
			    }

				writer.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			throw new NoFilePathException();
		}
		
	}

}
