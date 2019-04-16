import java.io.*;
import java.util.*;

public class MainMenu {
    private Functions functions = new Functions();
    private Values values = new Values();
    private boolean running;

    public MainMenu(){
        running = true;
        while(running){
            showMenu();
            switch(functions.intChoiceF(functions.intChoice, functions.scanner)){
                case 1:
                    System.out.println("Setup...");
                    running = false;
                    setup(functions, values);
                case 9:
                    running = false;
                    System.out.println("Shutting down...");
            }
        }
    }
    public void showMenu(){
        System.out.println("---SetSail---");
        System.out.println("1: Setup");
        System.out.println("9: Exit/Quit");
    }
    public static void setup(Functions functions, Values values){
        Setup newSetup = new Setup(functions, values);
    }
}
