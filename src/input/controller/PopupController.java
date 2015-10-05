package input.controller;
import input.model.Thing;
import input.view.PopupView;
public class PopupController
{
	private PopupView myPopups;
	private Thing myThing;
	
	public PopupController()
	{
		myPopups = new PopupView();
	}
	
	public void start()
	{
		String name = myPopups.getAnswer("Type in your name");
		
		myPopups.displayResponse("You typed in " + name);
		
		int age;
		
		String tempAge = myPopups.getAnswer("Type in your age");
		
		while (!isInteger(tempAge))
		{
			tempAge = myPopups.getAnswer("Type in an Integer!!!!!!!!");
		}
		if(isInteger(tempAge))
		{
			age = Integer.parseInt(tempAge);
		}
		else
		{
			age = -12345678;
				
	}
		myPopups.displayResponse("You typed in " + age);
		
		double weight;
		
		String tempWeight = myPopups.getAnswer("Type in your weight");
		
		while(!isDouble(tempWeight))
		{
			tempWeight = myPopups.getAnswer("Type in your weight please give me a valid number!!!");
		}
		
		if(isDouble(tempWeight))
		{
			weight = Double.parseDouble(tempWeight);
		}
		
		else
		{
			weight = -.9999999999;
			
		}
		
		myPopups.displayResponse("Your weight is" + weight);
	
		myThing = new Thing(name, age, weight);
		
		myPopups.displayResponse(myThing.toString());
	}
	 
	private boolean isInteger(String input)
	{
		boolean isInteger = false;
		
		try
		{
			int validInt = Integer.parseInt(input);
			isInteger = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.displayResponse("you did not enter an integer");
		}
		return isInteger;
	}
	private boolean isDouble(String input)
	{
		boolean isDouble = false;
		
		try
		{
			double validDouble = Double.parseDouble(input);
			isDouble = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.displayResponse("You didn't add a valid double BOOO!!!");
		}
		return isDouble;
	}
	
	
	
}
