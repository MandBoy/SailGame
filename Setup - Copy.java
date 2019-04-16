import java.util.*;
import java.io.*;

public class Setup {
    private int gameTurns;
    private String gameSize;
    private int gameShipAmount;
    private int gamePlayerAmount;
    private boolean running;

    public Setup(Functions functions, Values values) {
        running = true;
        while(running){
            setupMenu();
            switch(functions.intChoiceF(functions.intChoice, functions.scanner)){
                case 1:
                    values.gameTurnsHelper();
                    gameTurns = functions.intChoiceF(functions.intChoice, functions.scanner);

                    values.gameSizeHelper();
                    gameSize = functions.strChoiceF(functions.strChoice,functions.scanner);

                    values.gameShipAmountHelper();
                    gameShipAmount = functions.intChoiceF(functions.intChoice,functions.scanner);

                    values.gamePlayerAmountHelper();
                    gamePlayerAmount = functions.intChoiceF(functions.intChoice,functions.scanner);

                    checker(values.turnsList, values.sizesList,values.shipsAmountsList,values.playersAmountList);
                    break;
                case 2:
                    values.gameSizeHelper();
                    gameSize = functions.strChoiceF(functions.strChoice, functions.scanner);
                    checker(values.turnsList, values.sizesList,values.shipsAmountsList,values.playersAmountList);
                    break;
                case 3:
                    values.gameShipAmountHelper();
                    gameShipAmount = functions.intChoiceF(functions.intChoice, functions.scanner);
                    checker(values.turnsList, values.sizesList,values.shipsAmountsList,values.playersAmountList);
                    break;
                case 4:
                    values.gamePlayerAmountHelper();
                    gamePlayerAmount = functions.intChoiceF(functions.intChoice, functions.scanner);
                    checker(values.turnsList, values.sizesList,values.shipsAmountsList,values.playersAmountList);
                    break;
                case 5:
                    values.gameTurnsHelper();
                    gameTurns = functions.intChoiceF(functions.intChoice, functions.scanner);
                    checker(values.turnsList, values.sizesList,values.shipsAmountsList,values.playersAmountList);
                    break;
                case 9:
                    running = false;
                    break;
            }
        }
    }
    public void checker(int[]turnsList, String[]sizesList, int[]shipsAmountsList, int[]playerAmountsList){
        if(
                Arrays.asList(turnsList).contains(gameTurns)
                && Arrays.asList(sizesList).contains(gameSize)
                && Arrays.asList(shipsAmountsList).contains(gameShipAmount)
                && Arrays.asList(playerAmountsList).contains(gamePlayerAmount))
        {
            System.out.println("All is in order");
        }
        else{
            System.out.println("Still need more information.");
        }
        System.out.println(gameTurns + " " + gameSize + " " + gameShipAmount + " " + gamePlayerAmount);
    }
    public void setupMenu(){
        System.out.println("---Setup---");
        System.out.println("1: Game setAll");
        System.out.println("2: Game Size");
        System.out.println("3: Game ship amount");
        System.out.println("4: Game player amount");
        System.out.println("5. Game Turns");
        System.out.println("9: Exit/Quit");
    }
}
