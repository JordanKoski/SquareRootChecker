/**
*
* Prompts user to enter a value, checks if negative -- if not, prints out the square root
*
* @author <Jordan Koski>
* @version <13 Oct 2014>
*
*/

import java.util.Scanner; 

public class SquareRootChecker{

   public static void main(String[] args){
      Scanner scnr = new Scanner(System.in);
      System.out.println("Input an Integer");
      double double1 = scnr.nextDouble();
      if (double1 >= 0){
      System.out.println(Math.sqrt(double1));
      } else {
      System.out.println("There is an Error!");
      }
      
      
      
      }
      }
