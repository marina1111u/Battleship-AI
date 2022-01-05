package BattleShips;

public class Enemy_Battleship extends Ship{

        public Enemy_Battleship(String defaultName,int health) {
            super(defaultName, health);
        }

        public void setName() {
            name = "Cruiser";
        }

        public void setHealth() {
            health = 3;
        }

        public void setHit() {

        }
    }

}
