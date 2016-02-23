package org.testanglion.Results;

import java.util.HashMap;
import java.util.Map;

import org.testanglion.Core.*;

public class Result {
	String commentsOnhomePage;
	
	Map<Suite,SuiteResult> _result = new HashMap<Suite,SuiteResult>();
	
	public void addSuiteToResult(Suite suite,SuiteResult suiteresult)
	{
		_result.put(suite, suiteresult);
	}
	public void removeSuiteFromResult(Suite suite)
	{
		_result.remove(suite);
	}
	public Map<Suite,SuiteResult> returnResult()
	{
		Map<Suite,SuiteResult> _returnresult = new HashMap<Suite,SuiteResult>();
		_returnresult = this._result;
		return _result;
	}
	public void createReport()
	{
		
	}
	
	

}
