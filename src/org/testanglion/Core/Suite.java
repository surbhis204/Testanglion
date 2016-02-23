package org.testanglion.Core;

import java.util.Collection;

public class Suite {
	
	int order;
	int parallelTests = 0;
	Collection<Test> tests;
	String suiteDescription;
	
	public void setOrder(int pOrder)
	{
		order = pOrder;
	}
	
	public int getOrder()
	{
		return order;
	}
	public void setparallelTests(int pParallelTests)
	{
		parallelTests = pParallelTests;
	}
	
	public int getparallelTests()
	{
		return parallelTests;
	}
	
	public Collection<Test> getTests()
	{
		return tests;
		
	}
	
	public void setTests(Collection<Test> pTests)
	{
		tests = pTests;
	}
	
	public void setSuiteDescription(String pSuiteDescription)
	{
		suiteDescription = pSuiteDescription;
	}
	
	public String getSuiteDescription()
	{
		return suiteDescription;
	}

}
