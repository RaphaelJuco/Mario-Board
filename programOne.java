
/**
 * This class creates sample Mario board map from the Mario games
 *
 * @author (Raphael Juco)
 * @version (1/13/18)
 */
public class programOne
{
   public static void main(String[] args) {
    //Mario board one
   
    floor(); // Calls the method for creating the floor of the board
    floor();
    floor();
    floor();
    floor();
    floorSpace(); // Calls the method for creating a space between the floor of the board game
   
    floor();
    floorWithQuestionBox();//Calls the method for creating the floor with the question mark box
    floor();
    floorWithQuestionBox();
    floor();
    floorSpace();
   
    floor();
    secondStep();//Calls the method for creating the second step of the pyramid of the board game
    thirdStep();//Calls the method for creating the third step of the pyramid of the board game
    fourthStep();//Calls the method for creating the fourth step of the pyramid of the board game
    fifthStep();//Calls the method for creating the fifth step of the pyramid of the board game
    sixthStep();//Calls the method for creating the sixth step of the pyramid of the board game
    floor();
    floor();
    poleFinish();//Calls the method for creating the goal/pole on the board
    floorSpace();
    
   //Mario board two
    floor();//The same methods are used from board one
    floor();
    floorWithQuestionBox();
    floor();
    floor();
    floorSpace();
    
    floor();
    floorWithQuestionBox();
    floorWithQuestionBox();
    floorWithQuestionBox();
    floor();
    floorSpace();
    
    floor();
    floorWithQuestionBox();
    floor();
    floorWithQuestionBox();
    floor();
    floorSpace();
    
    floor();
    secondStep();
    thirdStep();
    fourthStep();
    fifthStep();
    sixthStep();
    floor();
    floor();
    poleFinish();
}
    public static void floor() { //Method for creating the floor on the board
      System.out.println("||");
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
