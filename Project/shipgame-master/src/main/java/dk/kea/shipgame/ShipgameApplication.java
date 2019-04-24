package dk.kea.shipgame;
import dk.kea.shipgame.Model.MainMenu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShipgameApplication{
    public static void main(String[] args){
        MainMenu mainmenu = new MainMenu();
        SpringApplication.run(ShipgameApplication.class,args);
    }
}
