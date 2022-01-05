import package BattleShips;

public class Enemy_Board{
    private Destroyer destroyer;
    private Carrier carrier;
    private Battleship battleship;
    private Submarine submarine;
    private Cruiser cruiser;

    private int width, height;

    private String hit(coords, coords){

        if(coord == placement){
            ship.health--;
            ship.BrokenPieces.add(coord);
            return "hit"+ ship;
        }

        else{
            return "miss";
        }

    }

}
