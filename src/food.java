public class food {

    private int foodexist;
    public int foodx;
    public int foody;
    private int matbit;

    public food() {
        int maxnum = 999;
        int minnum = 1;
        int randomnumX = minnum + (int) (Math.random() * maxnum);
        int randomnumY = minnum + (int) (Math.random() * maxnum);
        foodx = randomnumX;
        foody = randomnumY;


    }
}

