
/**
 * Write a description of class Date here.
 *
 * @author (Subhan Tariq)
 * @version (09/28/2022)
 */

import java.util.*;

public class Date
{ 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("what day of the week is it? ");
        String day = s.nextLine();
        
        System.out.print("what month is it? ");
        String month = s.nextLine();
        
        System.out.print("what year is it? ");
        String year = s.nextLine();
        
        System.out.print("what day of the month it is? ");
        String num = s.nextLine();
        
        System.out.println("American Format: " + day + ", " + month + " " + num + ",  " + year);
        System.out.println("European Format: " + month + " " + day + ",  " + num + "  " + year);                      
    } // end of main method


} // end of date class
