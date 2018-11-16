

public class World {
    public food[] matbit;
    public void generateFood() {
        matbit = new food[100];
        for (int i = 0; i < 100; i++) {
            matbit[i] = new food();
        }
    }
}
