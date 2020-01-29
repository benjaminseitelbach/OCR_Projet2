package com.hemebiotech.analytics;

import java.util.Map;

public interface IAlphabeticalOrder {
	
	/** 
	 * @return an alphabetically sorted map with a String as key which corresponds to the symptom
	 *  and an Integer as value which corresponds the counter of the corresponding symptom
	 */
	Map<String, Integer> getSymptomsCounterAlphabetically();

}
