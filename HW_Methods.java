
/**
 * This class uses methods to print out Mario boards from the game.
 *
 * @author (Raphael Juco)
 * @version (1/16/18)
 */
import java.util.Scanner;//For reading keyboard input
public class HW_Methods
{
public static void main(String[] args)
{    
    runProgramOne();//Calls for the method under runProgramOne
    runProgramTwo();//Calls for the method under runProgramtwo
}
public static void runProgramOne(){//Method that is called in main
    //Mario board one   
    firstSegment();//Calls for the method firstSegment
    secondSegment();//Calls for the method secondSegment
    Pyramid();//Calls for the method Pyramid
    
    //Mario board two
    firstSegment();//The second board uses the same methods used on the first board
    secondSegment();
    secondSegment();
    firstSegment();
    Pyramid();
}
public static void runProgramTwo(){//Method that is called in main
    Scanner keyboard = new Scanner(System.in);//Sets the Scanner funtion to keyboard and allows the user input to be used and assigned
    System.out.println("What does a Coin look like?");//Prints and asks the user "What does a Coin lool like?"
    System.out.println("What does Mario look like?");//Prints and asks the user "What does Mario look like?"
    String Coin = keyboard.next();//Takes the user input from "What a Coin looks like?" and assign that to the String Coin
    String Mario = keyboard.next();//Takes the user input from "What Mario looks like?" and assign that to the String Mario
  
    firstSegment();
    secondSegment();
    firstSegmentwithCoin(Coin);//Calls the method firstSegmentwithCoin which contains the String Coin
    secondSegmentwithCoin(Coin);//Calls the method secondSegmentwithCoin which contains the String Coin
    PyramidwithMario(Mario);//Calls the method PyramidwithMario which contains the String Mario
}
public static void firstSegment() { //Method for creating the first segment of the board
    System.out.println("||");//Prints out "||" which acts as the floor on the board
    System.out.println("||");
    System.out.println("||");
    System.out.println("||");
    System.out.println("||");
    System.out.println(" ");//Creates a space between the floors
}
public static void secondSegment() {//Method for creating the second segment of the board
    System.out.println("||");    
    System.out.println("||   |?|");
    System.out.println("||");
    System.out.println("||");
    System.out.println("||   |?|");
    System.out.println("||");
    System.out.println(" ");
}
public static void Pyramid() {//Method for creating the Pyramid of the board
    System.out.println("||");
    System.out.println("||||");
    System.out.println("||||||");
    System.out.println("||||||||");
    System.out.println("||||||||||");
    System.out.println("||||||||||||");
    System.out.println("||");
    System.out.println("||");
    System.out.println("|---------------^");
    System.out.println(" ");
}
public static void secondSegmentwithCoin(String Coin) {//Replica of the secondSegment method but contains the String Coin 
    System.out.println("||");    
    System.out.println("||   |?|" + Coin);//Prints out what's under ("") and then adds what the variable Coin contains
    System.out.println("||");
    System.out.println("||");
    System.out.println("||   |?|" + Coin);
    System.out.println("||");
    System.out.println(" ");
}
public static void firstSegmentwithCoin(String Coin) {
    System.out.println("||");
    System.out.println("||" + Coin);
    System.out.println("||");
    System.out.println("||" + Coin);
    System.out.println("||");
    System.out.println(" ");
}
public static void PyramidwithMario(String Mario) {////Replica of the Pyramid method but contains the String Mario
    System.out.println("||");
    System.out.println("||||");
    System.out.println("||||||");
    System.out.println("||||||||");
    System.out.println("||||||||||");
    System.out.println("||||||||||||" + Mario);////Prints out what's under ("") and then adds what the variable Mario contains
    System.out.println("||");
    System.out.println("||");
    System.out.println("|---------------^");
    System.out.println(" ");
}
}