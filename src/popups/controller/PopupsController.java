package popups.controller;

import popups.view.PopupViewer;

public class PopupsController
{
	private PopupViewer display;
	
	public PopupsController()
	{
		display = new PopupViewer();
	}
	
	public void start()
	{
		String answer = "Sample";
		while(answer != null && !answer.equals(""))
		{
		
		display.displayMessage("Whats up, Geeks!! :D");
		
		answer = display.collectResponse("What the heck is going on?!");
		display.displayMessage(answer + " is what you said");
		}
	}
	/**
	 * Checks is the supplied String can be parseed to a double value.
	 * @param potentialValue The string to test.
	 * @return Weather the value could be parsed; true if it can be parsed; false otherwise.
	 */
	private boolean isDouble(String potentialValue)
	{
		boolean isParsable = false;
		
		try
		{
			double test = Double.parseDouble(potentialValue);
			isParsable = true;
		}
		catch(NumberFormatException notDouble)
		{
			display.displayMessage("This not a double value =:((");
		}
		
		return isParsable;
	
	}
	
	
}
