package popups.controller;

import popups.view.PopupViewer;

import popups.model.PopupsModel;
import java.util.List;
import java.util.ArrayList;

public class PopupsController
{
	private PopupViewer display;
	
	private List<PopupsModel> popupsList;
	
	public PopupsController()
	{
		display = new PopupViewer();
		popupsList = new ArrayList<PopupsModel>();
	}
	
	public void start()
	{
		learnLists();
	}
	
	private void testLoop()
	{
		String answer = "Sample";
		while(answer != null && !isDouble(answer))
		{
		
		display.displayMessage("Whats up, Geeks!! :D");
		
		answer = display.collectResponse("You need to type in a double value!!");
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
		catch(NumberFormatException notInt)
		{
		display.displayMessage(notInt.getMessage());
		display.displayMessage("Type in an integer next time!!!");	
		}
		  
		return isParseable;
	}
	
	private void learnLists()
	{
		display.displayMessage(popupsList.size() + "is the size of the list.");
		PopupsModel testPopups = new PopupsModel();
		popupsList.add(testPopups);
		display.displayMessage(popupsList.size() + " is the size of the list.");
		
		for (int index = 0; index < 5; index++)
		{
			PopupsModel addPopupsModel = new PopupsModel();
			popupsList.add(addPopupsModel);
			display.displayMessage(addPopupsModel.getWords());
		}
		
		display.displayMessage(popupsList.size() + " is the size!");
		
		popupsList.get(3).setWords("Look I changed a value");
	    PopupsModel temp = popupsList.get(4);
	    temp.setWords("Stuff");
	    
	    for ( int index = 0; index < popupsList.size(); index++)
	    {
	    	display.displayMessage(popupsList.get(index).getWords());
	    }
	    popupsList.add(3, new PopupsModel());
	    
	    display.displayMessage("The Size is" + popupsList.size());
	    
	    popupsList.remove(0);//No longer have access to this object. 
	    
	    display.displayMessage("the size is" + popupsList.size());
	    
	    PopupsModel deletedPopups = popupsList.remove(3);
	    display.displayMessage(deletedPopups.getWords() + "and the size is " + popupsList.size());
	    
	    popupsList.set(0,deletedPopups);
	    
	    for (int index = 0; index < popupsList.size(); index++)
	    {
	    	display.displayMessage(popupsList.get(index).getWords());
	    }
	    
	    for (PopupsModel currentPopupsModel : popupsList)
	    {
	    	display.displayMessage(currentPopupsModel.getWords()); 
	        
	    	popupsList.get(5).setWords("Are you Ready?");
	    }
	    	for (int index = 0; index < 13; index++)
	    	{
	    		PopupsModel addUltimatePopup = new PopupsModel();
	    		popupsList.add(addUltimatePopup);
	    		display.displayMessage("YEAAAHHHHHH");
	        }
	}
}
