

public class robot {
    public boolean dead = false;
    public int x = 25;
    public int y = 25;
    public int foodlvl = 100;



    /*if (foodlvl <= 0) {
        dead = true;
    }

    if (foodlvl <= 20) {
        while (robotX > )
    }*/

    public void Move(int direction) {
        if (direction == 1) {
            x++;     //UP
        }
        else if (direction == 2) {
            y++;     //RIGHT
        }
        else if (direction == 3) {
            x--;     //DOWN
        }
        else if (direction == 4) {
            y--;     //LEFT
        }
    }

}
