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
	 * Checks is the supplied String can be parsed to a double value.
	 * @param potentialValue The string to test.
	 * @return Weather the value could be parsed; true if it can be parsed; false otherwise.
	 */
	private boolean isDouble(String potentialValue)
	{
		boolean isParseable = false;
		
		try
		{
			double test = Double.parseDouble(potentialValue);
			isParseable = true;
		}
		catch(NumberFormatException notDouble)
		{
			display.displayMessage("This not a double value =:((");
		}
		
		return isParseable;
	
	}
	/**
	 * Checks if the supplied String can be Parsed to a integer value.
	 * @param potentialNumber The String to test.
	 * @returnWeather the number could be parsed; true if it can be parsed; false if otherwise.
	 */
	private boolean isInteger(String potentialNumber)
	{
		boolean isParseable = false;
		
		try
		{
			int test = Integer.parseInt(potentialNumber);
			isParseable = true;
		}
		catch(NumberFormatException ontInt)
		{
		display.displayMessage(notInt.getMessage());
		display.displayMessage("Type in an integer next time!!!");	
		}
		
		return isParseable;
	}
	
	
}
