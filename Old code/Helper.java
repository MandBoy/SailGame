import java.util.*;
import java.io.*;

public class Helper{
    public int[] turnsList = {10,20,50};
    public final String[] sizesList = {"Small","Medium","Large"};
    public final int[] shipsAmountsList = {4,8,16};
    public final int[] playersAmountList = {2,4,8};

    public void gameTurnsHelper(){
        System.out.println("Amount of turns: "
                + Arrays.toString(turnsList));
    }
    public void gameSizeHelper(){
        System.out.println("Size of game: "
                + Arrays.toString(sizesList));
    }
    public void gameShipAmountHelper(){
        System.out.println("Amount of ships pr person: "
                + Arrays.toString(shipsAmountsList));
    }
    public void gamePlayerAmountHelper(){
        System.out.println("Players in game: "
                + Arrays.toString(playersAmountList));
    }
}

