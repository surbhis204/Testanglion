package org.testanglion.Reporter;

public interface IColourScheme {
	
	String getTestFailColour();
	String getTestPassColour();
	String getSuiteFailColour();
	String getSuitePassColour();
	String setTestFailColour();
	String setTestPassColour();
	String setSuiteFailColour();
	String setSuitePassColour();
	String getBackgroundColour();
	String setBackgroundColour();
	String setExceptionColour();
	String getExceptionColour();
}
