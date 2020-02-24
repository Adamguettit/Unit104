//Created by: Adam Guettit
//Created on: Feb 23
// Unit 1-03
// Mr. Coxall (ICS4U)

// This program tells you how much you should microwave your food food

import java.util.Scanner;

class Microwave {

  public static void main(String[]args) {
      
    int food;
    int amount;
    double time = 0;
    Scanner wordScanner = new Scanner(System.in);
    
    //Getting user input.
    System.out.println("Enter 1 for pizza, 2 for sub, or 3 for soup");
    food = wordScanner.nextInt();
    System.out.println("Please enter quantity. (1-3)"); 
    amount = wordScanner.nextInt();
    
    try {
        
      if (food == 1) {
        time = 0.75;
      } else if (food == 2) {
        time = 1;
      } else if (food == 3) {
        time = 1.75; 
      }
      
      if (amount == 2) {
        time = time * 1.5;
      } else if (amount == 3) {
        time = time * 2;
      }
      
      //check if the number is right
      if (food < 1 | food > 3) {
        System.err.println("please enter the correct number for your food (1-3)");
      } else if (amount < 1 | amount > 3) {
        //check if the amount is right
        System.err.println("please enter the correct number for the quanity (1-3)");
      } else {
        System.out.println("Your total cook time is " + time + " minutes");
      }
      
    } catch (Exception e) {
      System.err.println("Invalid Input. Only 1-3 items at a time.");
    }
  }
}
