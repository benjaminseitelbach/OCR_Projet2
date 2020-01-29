package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		//Read source file and get all symptoms
		List<String> symptoms = new ReadSymptomDataFromFile().getSymptoms();

		//Get symptoms counter from the list of all symptoms
		Map<String, Integer> symptomsCounter = new SymptomsCounter(symptoms).getSymptomsCounter();
		
		//Map<String, Integer> sortedSymptomsCounter = new TreeMap<String, Integer>(symptomsCounter);
		
		//Get sorted symptoms counter
		Map<String, Integer> sortedSymptomsCounter = new AlphabeticalOrder(symptomsCounter).getSymptomsCounterAlphabetically();
		
		//Write sorted symptoms counter in result file
		new Writer(sortedSymptomsCounter).write();

	}

}
