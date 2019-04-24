package dk.kea.shipgame.Model;

public class CreateGame {
    public CreateGame(Inputhandler inputhandler, Functions functions, Values values) {
        createPlayer(inputhandler,functions,values);
        createMap(inputhandler, functions, values);
    }
    public void createPlayer(Inputhandler inputhandler, Functions functions, Values values){
        Player player = new Player(inputhandler,functions,values);
    }
    public void createMap(Inputhandler inputhandler, Functions functions, Values values){
        Map map = new Map(inputhandler,functions,values);
    }
}
