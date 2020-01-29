package com.hemebiotech.analytics;

import java.util.Map;

public interface ISymptomsCounter {
	
	/** 
	 * @return a map with a String as key which corresponds to the symptom
	 *  and an Integer as value which corresponds to the counter of the corresponding symptom
	 */
	
	Map<String, Integer> getSymptomsCounter();
}
