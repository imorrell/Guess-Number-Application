
package guessnumber_app;

import java.util.Scanner;

public class MyValidation
    {
    // determine if the user wants to continue?
    // only accept Y/y or N/n from the user
    public static boolean getContinue()
        {
        String choice;
        boolean ok = true;
        boolean result = true;
         
        while(ok)
            {
            System.out.print("Continue? (y/n): ");
            Scanner sc = new Scanner(System.in);
            
            choice = sc.nextLine(); // NOTE nextLine()
            
            if(choice.equalsIgnoreCase("y"))
                {
                ok = false;
                result = true;
                }
            else if(choice.equalsIgnoreCase("n") )
                {
                ok = false;
                result = false;
                }
            else
                {
                System.out.println("\nError! Please enter Y or N.");
                }
            }
        return result;
        }
    }
