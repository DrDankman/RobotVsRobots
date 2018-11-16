

public class main {
    public static void main(String[] args) {

        food[] food = new food[5];
        for (int i=0; i<5; i++) {
            food[1] = new food();
        }

        /*
        food food1 = new food();
        System.out.println("Food1:" + " X=" + food1.x + " Y=" + food1.y);

        food food2 = new food();
        System.out.println("Food2:" + " X=" + food2.x + " Y=" + food2.y);

        food food3 = new food();
        System.out.println("Food3:" + " X=" + food3.x + " Y=" + food3.y);

        food food4 = new food();
        System.out.println("Food4:" + " X=" + food4.x + " Y=" + food4.y);

        food food5 = new food();
        System.out.println("Food5:" + " X=" + food5.x + " Y=" + food5.y);
        */

        robot robot = new robot();
        System.out.println("Robot:" + " X=" + robot.x + " Y=" + robot.y);

        for(int i=0; i<5; i++) {
            int distanceX = Math.abs(robot.x) - Math.abs(food[i].x);
            int distanceY = Math.abs(robot.y) - Math.abs(food[i].y);
            int distance = Math.abs(Math.abs(distanceX) + Math.abs(distanceY));
            int distanceShortest = 100000000;
            int distanceShortesti;

            if (distance < distanceShortest) {
                distanceShortest = distance;
                distanceShortesti = i;
                System.out.println("Kortaste: " + distanceShortest + "Index: " + distanceShortesti);
            }
        }

        if (robot.foodlvl <= 30) {
        }

        /*
        int distanceX = Math.abs(robot.x) - Math.abs(food1.x);
        //System.out.println("distanceX: " + distanceX);
        int distanceY = Math.abs(robot.y) - Math.abs(food1.y);
        //System.out.println("distanceY: " + distanceY);
        int distance = Math.abs(distanceX) + Math.abs(distanceY);
        distance = Math.abs(distance);
        System.out.println("Distance1: " + distance);
        */
    }
}
