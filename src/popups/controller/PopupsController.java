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
}
