package BattleShips;
import java.util.Random;
public class Coin_Flip {

    public static void main(String[] args) {
        Random coinflip = new Random();
        int turn = coinflip.nextInt(1);

        if (turn == 1){
            System.out.println("I go first.");
        }
        else{
            System.out.println("You go first.");
        }

    }
}
