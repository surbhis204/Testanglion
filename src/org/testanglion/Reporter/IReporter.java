package org.testanglion.Reporter;

public interface IReporter {
	
	void createReporter(IPageCreator pagecreator , IColourScheme colourScheme);

	public void writeHTMLReport(String name);
	public void writeEmailableReport(String name);
	public void writeZippableReport(String name);
}
