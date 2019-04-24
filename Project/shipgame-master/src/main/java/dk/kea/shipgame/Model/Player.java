package dk.kea.shipgame.Model;

import java.io.*;
import java.util.*;

public class Player {
    private String playerName;
    private int playerNumber;
    private String playerNatuality;
    private ArrayList<Ship> playerShips = new ArrayList<Ship>();

    public Player(Inputhandler inputhandler, Functions functions, Values values){
        System.out.print("Player name: ");
        this.playerName = inputhandler.strChoice();
        System.out.print("Player number: ");
        this.playerNumber = inputhandler.intChoice();
        System.out.print("Player natuality: ");
        this.playerNatuality = inputhandler.strChoice();
        createShips(inputhandler, functions, values);
    }
    public void createShips(Inputhandler inputhandler, Functions functions, Values values){
        playerShips.add(new Ship(inputhandler,functions,values));
    }
}
