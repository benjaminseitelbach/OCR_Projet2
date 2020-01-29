package com.hemebiotech.analytics;

import java.util.Map;
import java.util.TreeMap;

public class AlphabeticalOrder implements IAlphabeticalOrder {
	
	private Map<String, Integer> symptomsCounter;
	
	/**
	 *  @param symptomsCounter map with a String as key which corresponds to the symptom
	 *  and an Integer as value which corresponds to the counter of the corresponding symptom
	 */
	
	public AlphabeticalOrder(Map<String, Integer> symptomsCounter) {
		this.symptomsCounter = symptomsCounter;
	}
	
	@Override
	public Map<String, Integer> getSymptomsCounterAlphabetically() {
		
		//Get alphabetically ordered map
		Map<String, Integer> result = new TreeMap<String, Integer>(this.symptomsCounter);
		return result;
	}
}
