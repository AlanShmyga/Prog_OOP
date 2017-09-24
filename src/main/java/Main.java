public class Main {

    public static void main(String[] args) {
//        final Transport transport = new Car();
//        transport.goSomewhere(1, 17);
//        Plane boeing = new Plane(0);
//        transport.goSomewhere(1, 200);

        Ship titanic = new Ship();
        titanic.doSomething();
        titanic.goSomewhere( 9, 29,"Going by ");

        Car honda = new Car();
        honda.doSomething();
    }
}
