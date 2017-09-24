public class Plane implements Transport {

    private int height;
    private int width;

    public Plane(int height) {
        this.height = height;
    }

    public void goSomewhere(int a, int b) {
        helpMethod(a, b);
    }

    void helpMethod(int a, int b) {
        System.out.println("Flying from " + a + " to " + b);
    }
}
