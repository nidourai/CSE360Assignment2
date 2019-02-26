/* 
Nassim Idouraine 
1210515420
Assignment Number 2
Description: The purpose of this assignment is to calculate numbers that are 
inputed in the main class. The user can find the total number or print out the
history of the actions (i.e. addition, subtraction, multiplication, division).
*/

package cse360assign2;
import java.util.ArrayList;

public class Calculator 
{

	private int total; //creating the total variable
	private ArrayList <String> History = new ArrayList<String>(); //creating an array
	
	//This is a constructor that initializes the variables. 
	
	public Calculator () 
	{
		 total = 0;  
		 String words = Integer.toString(total); 
		 History.add(words); //adds integer to string method to the array
	}
	
	// This method returns the total number after all the values have been 
	//calculated.
	
	public int getTotal () 
	{
		return total;
	}
	
	// This method adds the total number with the new value that is inputed. 
	
	public void add (int value) 
	{
		total = total + value;
		History.add("+");
		History.add(Integer.toString(value));
	}
	
	// This method subtracts the total number with the new value that is inputed. 
	
	public void subtract (int value) 
	{
		total = total - value;
		History.add("-");
		History.add(Integer.toString(value));
	}
	
	// This method multiplies the total number with the new value that is inputed. 
	
	public void multiply (int value) 
	{
		total = total * value;
		History.add("*");
		History.add(Integer.toString(value));
	}
	
	// This method divides the total number with the new value that is inputed.
	// If the value inputed is 0, then the total number will be 0.
	
	public void divide (int value) 
	{
		if (value == 0)
		{
			total = 0;
		}
		else
		{
			total = total / value;
		}
		
		History.add("/");
		History.add(Integer.toString(value));
	}
	
	//This method returns a string of all the actions that were used to 
	//calculate the total.
	
	public void getHistory () 
	{
		for(int index = 0; index < History.size(); index++)
		{
			System.out.print(History.get(index));
		}
	}
}
