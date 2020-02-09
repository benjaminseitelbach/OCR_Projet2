package com.hemebiotech.analytics;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class SymptomsCounter implements ISymptomsCounter {
	
	private List<String> symptoms;
	
	/**
	 *  @param list of Strings with all symptoms
	 */
	
	public SymptomsCounter(List<String> symptoms) {
		this.symptoms = symptoms;
	}
	
	@Override
	public Map<String, Integer> getSymptomsCounter() {
		Map<String, Integer> result = new HashMap<>();
		
		//Loop on all symptoms
		for(String symptom:symptoms) {
			
			if(result.get(symptom) == null) {
				
				result.put(symptom, 1);
				
			} else {
				
				//Get corresponding symptom's counter
				int counter = result.get(symptom);
				
				//Symptom's counter incrementation
				result.put(symptom, counter + 1);
			}

		}
		
		return result;
	}
}
