import java.util.*;
import java.io.*;

public class Setup {
    private static int gameTurns;
    private static String gameSize;
    private static int gameShipAmount;
    private static int gamePlayerAmount;

    private static final int[] turnList = {1,2,3};
    private static final String[] sizeList = {"Small","Medium","Large"};
    private static final int[] shipAmountList = {2,4,6};
    private static final int[] playerAmountList = {2,4,8};

    public Setup(Inputhandler inputhandler, Values values, Functions functions) {
        values.running = true;
        while(values.running){
            setupMenu();
            switch(inputhandler.intChoice()){
                case 1:
                    helper();
                    System.out.println("---Your choice---");
                    System.out.print("Turns: ");
                    gameTurns = inputhandler.intChoice();
                    System.out.print("Size: ");
                    gameSize = inputhandler.strChoice();
                    System.out.print("Ships: ");
                    gameShipAmount = inputhandler.intChoice();
                    System.out.print("Players: ");
                    gamePlayerAmount = inputhandler.intChoice();
                    if(checker() == true){
                        createGame(inputhandler, functions, values);
                    }
                    else {
                        functions.clearConsole();
                    }
                    break;
                case 9:
                    values.running = false;
                    functions.clearConsole();
                    break;
            }
        }
    }
    public void helper(){
        System.out.println("---Available Choices---");
        System.out.println("Turns: " + Arrays.toString(turnList));
        System.out.println("Size: " + Arrays.toString(sizeList));
        System.out.println("Ships: " + Arrays.toString(shipAmountList));
        System.out.println("Players: " + Arrays.toString(playerAmountList));
        System.out.println("");
    }
    //Not working...
    public static boolean checker(){
        if(
                Arrays.asList(turnList).contains(gameTurns)
                && Arrays.asList(sizeList).contains(gameSize)
                && Arrays.asList(shipAmountList).contains(gameShipAmount)
                && Arrays.asList(playerAmountList).contains(gamePlayerAmount))
        {
            System.out.println("All is in order.");
            return true;
        }
        else{
            System.out.println("Still need more information.");
        }
        System.out.println("");
        return false;
    }
    public void createGame(Inputhandler inputhandler, Functions functions, Values values){
        CreateGame createGame = new CreateGame(inputhandler, functions, values);
    }
    public void setupMenu(){
        System.out.println("---Setup---");
        System.out.println("1: Game setAll");
        System.out.println("9: Exit/Quit");
    }
}
