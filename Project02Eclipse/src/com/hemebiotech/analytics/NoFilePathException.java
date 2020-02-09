package com.hemebiotech.analytics;

public class NoFilePathException extends Exception {
	public NoFilePathException() {
		System.out.println("Please set filepath in Config class");
	}

}
