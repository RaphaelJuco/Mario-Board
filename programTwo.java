
/**
 * Write a description of class programTwo here.
 *
 * @author (Raphael Juco)
 * @version (1/15/18)
 */

import java.util.Scanner;

public class programTwo
{

public static void main(String[] args) {  

    Scanner keyboard = new Scanner(System.in);     
    System.out.println("What does a Coin look like?");
    System.out.println("What does Mario look like?"); 
    String Coin = keyboard.next();
    String Mario = keyboard.next();
    
  
    floor(); // Calls the method for creating the floor of the board
    floor();
    floor();
    floor();
    floor();
    floorSpace(); // Calls the method for creating a space between the floor of the board game
   
    floor();
    floorWithQuestionBox();
    floorWithQuestionBox();//Calls the method for creating the floor with the question mark box
    floorWithQuestionBox();
    floor();
    floorSpace();

    floorWithCoin(Coin);//Calls the method for creating the floor with coin
    floorWithQuestionBox();
    floorWithCoin(Coin);
    floorWithQuestionBox();
    floorWithCoin(Coin);
    floorSpace();
    
    floor(); 
    floor();
    floor();
    floor();
    floor();
    floorSpace();
    
    floor();
    secondStep();//Calls the method for creating the second step of the pyramid of the board game
    thirdStep();//Calls the method for creating the third step of the pyramid of the board game
    fourthStep();//Calls the method for creating the fourth step of the pyramid of the board game
    fifthStep();//Calls the method for creating the fifth step of the pyramid of the board game
    StepwithMario(Mario);//Calls the method for creating the sixth step of the pyramid of the board game
    floor();
    floor();
    poleFinish();//Calls the method for creating the goal/pole on the board
    floorSpace();
}    
    public static void floor() { //Method for creating the floor on the board
      System.out.println("||");
    }
    public static void floorWithCoin(String Coin) { //Method for creating the floor with user input coin on the board           
      System.out.println("||" + Coin);      
    }
    public static void floorWithQuestionBox() {//Method for creating the floor as well as the question mark box on the board
      System.out.println("||   |?|");
    }
    public static void secondStep() {//Method for creating the second step on the pyramid on the board
      System.out.println("||||");
    }
    public static void thirdStep() {//Method for creating the third step on the pyramid on the board
      System.out.println("||||||");
    }
    public static void fourthStep() {//Method for creating the fourth step on the pyramid on the board
      System.out.println("||||||||");
    }
    public static void fifthStep() {//Method for creating the fifth step on the pyramid on the board
      System.out.println("||||||||||");
    }
    public static void StepwithMario(String Mario) {//Method for creating the step on the pyramid with user input Mario on the board     
      System.out.println("||||||||||||" + Mario);
    }
    public static void sixthStep() {//Method for creating the sixth step on the pyramid on the board     
      System.out.println("||||||||||||");
    }
    public static void poleFinish() {//Method for creating the goal/pole on the board
      System.out.println("|---------------^");
    }
    public static void floorSpace() {//Method for creating a new line and acts as space between the floors on the board
      System.out.println();
    }
}