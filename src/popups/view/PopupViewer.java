package popups.view;

import javax.swing.JOptionPane;
/**
 * Popup viewer class
 * @author Chris.Fabian
 *@version September 27, 2016
 */
public class PopupViewer
{

	/**
	 * makes a popup window to display the supplied message.
	 * @param message The message to be placed in the popup.
	 * 
	 */
	public void displayMessage(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}
	/**
	 * Creates an input popup to collect a response as a string
	 * @param question The question being asked to the user
	 * @return The users response. 
	 */
	public String collectResponse(String question)
	{
		String response = "";
		
		response = JOptionPane.showInputDialog(null, question);
		
		return response;
	}
	/**
	 * Creates a popup to ask a yes/no/cancel type question.
	 * @param question The question bing asked the user.
	 * @return The constant values from JOptionPane for y/n/c.
	 */
	public int collectUserOption(String question)
	{
		int response = 0;
		
		response = JOptionPane.showConfirmDialog(null, question);
		
		return response;
	}
}
