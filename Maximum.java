/** @author corey switzer
 * This program allows the user to input three integer and will find which number is the greatest
 */

import java.util.Scanner;
public class Maximum{
    public static void main(String[] args){

        //Declared Values
        int x, y, z, max;

        //Allows user input
        Scanner input = new Scanner(System.in);

        //Prompts user to input
        System.out.println("This program finds the maximum of three integer numbers.");

        System.out.print("Enter the 1st integer:");
        x = input.nextInt();

        System.out.print("Enter the 2nd integer:");
        y = input.nextInt();

        System.out.print("Enter the 3rd integer:");
        z = input.nextInt();

        //Finds maximum
        max = x;

        if(x>y)
        {    
            max = x;
        }    
        if(x>z)
        {    
            max = x;
        }    
        if(y>x)
        {
            max = y;
        }
        if(y>z)
        {
            max = y;
        }
        if(z>x)
        {
            max = z;
        }
        if(z>x)
        {
            max = z;
        }
        //Prints out results
        System.out.print("The maximum of ");
        System.out.print(x + ", " + y + ", and " + z);
        System.out.println(" is " + max + "!");
}
}