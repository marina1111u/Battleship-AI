package Methods;
import java.util.Scanner;

public class Track_own_ships {
    Scanner cs = new Scanner(System.in);

//change each ship to be differented via numbers
    /*
    Destroyer = index 0s, length of 2
    Submarine = index 3s, length of 3
    Cruiser = index 4s, length of 3
    Battleship = index 5s, length of 4
    Carrier = index 6s, length of 5
     */

    public Track_own_ships(int[][] our_Ships, boolean turn) {

        //enemy shots
        int rows = cs.nextInt();
        int columns = cs.nextInt();

        int enemy_Shots[][] = new int[rows][columns];


        if (our_Ships[rows][columns] == 0) {
            System.out.println("Oh no, you hit our destroyer"); //destroyer
            //music here - Kaboom.
            our_Ships[rows][columns] = -9; //setting the index as 'hit, and now injured
            turn = !turn;
        } else if (our_Ships[rows][columns] == -9) { //just for our reference - we don't tell the enemy they hit us twice
            System.out.println("Oh no, you hit our destroyer"); //destroyer
            //music here - Kaboom.
            turn = !turn;
        } else if (our_Ships[rows][columns] == 3) {
            System.out.println("Oh no, you hit our submarine");
            //music here - Kaboom.
            our_Ships[rows][columns] = -3; //setting the index as 'hit, and now injured
            turn = !turn;
        } else if (our_Ships[rows][columns] == -3) { //just for our reference - we don't tell the enemy they hit us twice
            System.out.println("Oh no, you hit our submarine");
            //music here - Kaboom.
            turn = !turn;
        } else if (our_Ships[rows][columns] == 4) {
            System.out.println("Oh no, you hit our cruiser"); //cruiser
            //music here - Kaboom.
            our_Ships[rows][columns] = -4; //setting the index as 'hit, and now injured
            turn = !turn;
        } else if (our_Ships[rows][columns] == -4) { //just for our reference - we don't tell the enemy they hit us twice
            System.out.println("Oh no, you hit our cruiser"); //cruiser
            //music here - Kaboom.
            turn = !turn;
        } else if (our_Ships[rows][columns] == 5) {
            System.out.println("Oh no, you hit our battleship"); //battleship
            //music here - Kaboom.
            our_Ships[rows][columns] = -5; //setting the index as 'hit, and now injured
            turn = !turn;
        } else if (our_Ships[rows][columns] == -5) { //just for our reference - we don't tell the enemy they hit us twice
            System.out.println("Oh no, you hit our battleship"); //battleship
            //music here - Kaboom.
            turn = !turn;
        } else if (our_Ships[rows][columns] == 6) {
            System.out.println("Oh no, you hit our carrier"); //carrier
            //music here - Kaboom.
            our_Ships[rows][columns] = -6; //setting the index as 'hit, and now injured
            turn = !turn;
        } else if (our_Ships[rows][columns] == -6) { //just for our reference - we don't tell the enemy they hit us twice
            System.out.println("Oh no, you hit our carrier"); //carrier
            //music here - Kaboom.
            turn = !turn;
        } else if (our_Ships[rows][columns] == 1) {
            System.out.println("Lol, you missed.");
            //music here - lmao
            turn = !turn;
        }

        /*
        if (our_Ships has a row / columns of adjact negative numbers, set that match the assigned length and
        assigned negative value: ex.a pair of - 9 s in a row/columns = mark those negative number set as 1){
            //all set all array values in the array as 1
            turn = !turn;
        }
         */

        System.out.println("Okay, my turn." );

    }

}










