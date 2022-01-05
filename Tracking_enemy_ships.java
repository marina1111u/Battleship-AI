package BattleShips;
import javafx.util.Pair;
import java.util.ArrayList;
import java.util.Scanner;


public class Tracking_enemy_ships {
    /*
    Not the probabiiltiy thing rn. We go with the parity.
    1 = pervious shot was a hit, 0 = miss
     */

    public static void main(String[] args) {
        new Tracking_enemy_ships();
    }

    private Tracking_enemy_ships() {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        Pair<Integer, Integer> shot = new Pair<>(1,2);
        String ship_type = "shipship";
        ArrayList<Pair<Integer, Integer>> misses = new ArrayList<>();
        ArrayList<Pair<Integer, Integer>> hits = new ArrayList<>();

        //If we go first - this will be looped

        System.out.println(shot);

        System.out.println("Was it a hit? 1 for hit, and 0 for miss");
        result = sc.nextInt();

        if(result != 1){
            System.out.println("Aw shucks.");
            misses.add(shot);
            huntmode();
        }
        else{
            System.out.println("What ship?");
            ship_type = sc.next();
            hits.add(shot);
            trackmode();

        }
        }

        private void huntmode(){ // we find them

        //use parity like pair = (k, v) k++ each turn , in a while loop for 8, then v++
            // add a leave condition, if result = hit, since it starts at 1,2 - we can have it print A2 thou

        }

        private void trackmode() { // we kill them all

        // pain, checks can be instanited in a bit, first k++ to shift right, ...



        }




    }



