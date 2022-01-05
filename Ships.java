package BattleShips;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;

/*
Okay here's the run down:

The ships are not on the board. They are not the 1s in the board of 0s. They are marked by the coordinates on the board.

Each ship from the gets the coord from the board and tells the board if they are hit. If hit, they store the coord in the broken pieces array (list?).

 */


abstract class Ships {

        //Characteristics/State - (Instance variables)
        protected static String name;
        private static int health;
        private static Pair placement;

        //Constructor method - has the same name as the class, has parameters that are passed
        public Ships(String defaultName, int health)
        { //This is the constructor
            Pair<Integer, String> placement = new Pair<>(1, "2");
            name = defaultName;
            health = 0;
            ArrayList<Pair<Integer, String>> BrokenPieces = new ArrayList<>();
        }

        //Behaviours: Communicators and Actions

    //Void type methods to set values and also actions to perform - Modifier method (setter)

        public abstract void setName();
        public abstract void setHealth();
        public abstract void setHit();

    //Return type methods to get values - Accessor Method

        public void getName(String newName) { //sets a new name for the object ship - Modifier method (setter)
        }

        public void getHealth(int newHealth) { //sets whether the ship has sunk for the object "ship" - modifier method (setter)
        }


    }



