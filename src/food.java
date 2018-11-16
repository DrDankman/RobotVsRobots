import java.util.concurrent.ThreadLocalRandom;

import static java.lang.System.out;

public class food {

   public int x;
   public int y;


    public void foodPlacement() {

    //    out.println(foodx, foody);
    }

    public food() {
        x = ThreadLocalRandom.current().nextInt(0, 51);
        y = ThreadLocalRandom.current().nextInt(0, 51);


        /*
        int maxnum = 999;
        int minnum = 1;
        int randomnumX = minnum + (int) (Math.random() * maxnum);
        int randomnumY = minnum + (int) (Math.random() * maxnum);
        foodx = randomnumX;
        foody = randomnumY;
        */
    }
}

