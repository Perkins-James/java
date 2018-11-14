import java.util.Formatter;
import java.util.Scanner;


/**********************************************************
 * Program Name   : Practice Coding - Creating Methods
 * Author         : Alicia Erlenbusch
 * Date           : 11/14/18
 * Course/Section : CSC-111 303
 * Program Description: This program will act as the driver
 *   for practice creation methods lab assignment
 *
 * Methods:
 * -------
 * Main - manage an application that will find the avg of 3 #s
 *
 **********************************************************/


public class CreatingMethodsAre
{

   /**********************************************************
    * Method Name    : Main
    * Author         : Alicia Erlenbusch  
    * Date           : 11/14/18
    * Course/Section : CSC-111 303
    * Program Description:
    *
    * BEGIN Creating Methods
    *     Input employee first name
	 *     Input employee last name
    *     Input 3 integers
    *     Call method to format employee name to Last, First
    *     Clear screen
    *     Call a method to return the avg of the three integers
    *     Call a method to display the name and avg (2 decimal places)
    * END Creating Methods
    **********************************************************/
    

   public static void main (String [] args)
   {
      Scanner input = new Scanner(System.in);
      String formattedName;
      double average;
      
      /********************   Start main method  *****************/

      System.out.print("Enter Employee First Name: ");
      String firstName = input.next();
      System.out.print("Enter Employee Last Name: ");
      String lastName = input.next();
      System.out.print("Enter First Number: ");
      int num1 = input.nextInt();
      System.out.print("Enter Second Number: ");
      int num2 = input.nextInt();
      System.out.print("Enter Third number: ");
      int num3 = input.nextInt();
      input.close();
      // clear screen
      for (int i = 0; i < 25; ++i) System.out.println();

      formattedName = formatName(firstName,lastName);

      average = calculateAverage(num1,num2,num3);

      employeeInfo(formattedName,average);


      //call method to display name and average (to 2 decimal places)

   }//end main

	/**********************************************************
	* Method Name    : formatName
	* Author         : Alicia Erlenbusch
	* Date           : 11/14/18
	* Course/Section : CSC-111 303
	* Program Description:  This method will format a full name
	*    into phonebook format (name).
	*
	* BEGIN formatName(first name, last name)
	*     call method to make first name title case
	*     call method to make last name title case
	*     build name using phone book format
	*     return name in phone book format
	* END formatName
	**********************************************************/
	public static String formatName(String firstName, String lastName)
	{
		firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
      lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

      return lastName + "," + firstName;
	}//end calcAvg

   /**********************************************************
    * Method Name    : calcAvg
    * Author         : Alicia Erlenbusch
    * Date           : 11/14/18
    * Course/Section : CSC-111 303
    * Program Description:
    *
    * BEGIN Calculate Average(num1, num2, num3)
    *     calculate average of 3 integer parameters
    *     return the average
    * END Calculate Average
    **********************************************************/

    public static double calculateAverage(int num1,int num2, int num3)
    {
        int sum = num1 + num2 + num3;
        double average = sum / 3;
        return average;
	}//end calcAvg

   /**********************************************************
    * Method Name    : dispInfo
    * Author         : Alicia Erlenbusch
    * Date           : 11/14/18
    * Course/Section : CSC-111 303
    * Program Description:
    *
    * BEGIN Display the employee info(full name, avg)
    *     format the average to 2 decimal places
    *     display name and average on the screen
    * END Display the employee info
    **********************************************************/
    public static void employeeInfo(String fullName, double avg)
    {
	
        System.out.printf(fullName + " "  + "%.2f", avg );
	}

} //end Creating Methods


