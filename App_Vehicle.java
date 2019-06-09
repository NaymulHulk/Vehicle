public class App {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.accelarate(20);
        car.brake();

        Bus bus = new Bus();
        bus.start();
        bus.accelarate(10);
        bus.brake();
        bus.status();
    }
}