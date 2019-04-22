import java.io.*;
import java.util.*;

public class Functions {
    public static void clearConsole() {
        String OS = System.getProperty("os.name");
        try {
            if(OS.contains("Linux") || OS.contains("MAC")){
                System.out.print("\033[H\033[2J");
            }
            else if (OS.contains("Windows")){
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
            else {
                System.out.println("Du bør ikke være nået her til; se metode: clearConsole() i Menu class.");
            }
        }catch(IOException e){
            System.out.println("Fejl: " + e);

        }catch(InterruptedException e){
            System.out.println("Fejl: " + e);
        }
    }
}
