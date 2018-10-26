import javax.swing.*;

public class robot {
    private boolean dead = false;
    private int robotX;
    private int robotY;
    private int hunger = 100;



    /*if (hunger <= 0) {
        dead = true;
    }

    if (hunger <= 20) {
        while (robotX > )
    }*/

    public void Move(int direction) {
        if (direction == 1) {
            robotX++;     //UP
        }
        else if (direction == 2) {
            robotY++;     //RIGHT
        }
        else if (direction == 3) {
            robotX--;     //DOWN
        }
        else if (direction == 4) {
            robotY--;     //LEFT
        }
    }

}
