package Methods;
import java.util.Scanner;

public class Track_own_ships {
    Scanner cs = new Scanner(System.in);

    public void Track_own_ships(int[][] our_Ships, boolean turn, object) {

        //enemy shots
        int rows=cs.nextInt();
        int columns=cs.nextInt();

        //int enemy_Shots[][]=new int[rows][columns];

        if(our_Ships [rows][columns] == 0){
            System.out.println("Oh no, you hit our " + object);
            //music here - Kaboom.
            our_Ships [rows][columns] = 2; //setting the index as 'hit, and now injured
            turn = !turn;
        }

        else if(object.alive = true){
            //all set all array values in
            turn = !turn;
        }

        else if(our_Ships[rows][columns] == 2) {
            System.out.println("Oh no- wait. You already hit our " +object);
            //music here - kaboom?
            if (turn){
                turn = false;
            }
            else{
                turn = true;
            }

            /*note:
                       if (turn){
                           turn = false;
                        }
                        else{
                            turn = true;
                  }

                  is the same as turn = !turn


             */

        }

        else{
            System.out.println("Lol, you missed.");
            //music here - lmao
            turn = !turn;

        }
        System.out.println("Okay, my turn." );

    }

    }





