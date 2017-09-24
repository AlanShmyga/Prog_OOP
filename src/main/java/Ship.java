public class Ship extends AbstractTransport {

    void goSomewhere(int a, int b) {
        System.out.println("Go from " + a + " to " + b);
    }

    void goSomewhere(int a, int b, String message) {
        System.out.println(message + a + " " + b);
    }

    @Override
    void doSomething() {
        System.out.println("I'm Titanic");
    }
}
