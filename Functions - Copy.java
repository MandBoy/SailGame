import java.util.*;
import java.io.*;

public class Functions {
    public Scanner scanner = new Scanner(System.in);
    public int intChoice;
    public String strChoice;

    public String strChoiceF(String strChoice, Scanner scanner){
        strChoice = scanner.next();
        return strChoice;
    }
    public int intChoiceF(int intChoice, Scanner scanner){
        intChoice = scanner.nextInt();
        return intChoice;
    }
}
