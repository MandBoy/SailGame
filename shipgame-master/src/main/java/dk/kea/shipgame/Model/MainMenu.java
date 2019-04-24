package dk.kea.shipgame.Model;

import java.io.*;
import java.util.*;

public class MainMenu {
    private Inputhandler inputhandler = new Inputhandler();
    private Functions functions = new Functions();
    private Values values = new Values();

    public MainMenu(){
        values.running = true;
        while(values.running){
            showMenu();
            switch(inputhandler.intChoice()){
                case 1:
                    System.out.println("Setup...");
                    setup(inputhandler, values, functions);
                    values.running = false;
                    functions.clearConsole();
                    break;
                case 9:
                    System.out.println("Shutting down...");
                    values.running = false;
                    functions.clearConsole();
                    break;
            }
        }
    }
    public void showMenu(){
        System.out.println("---SetSail---");
        System.out.println("1: Setup");
        System.out.println("9: Exit/Quit");
    }
    public static void setup(Inputhandler inputhandler, Values values, Functions functions){
        Setup newSetup = new Setup(inputhandler, values, functions);
    }
}
