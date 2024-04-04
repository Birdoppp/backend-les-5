import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Plane a = new Plane();
        Plane b = new Plane();
        Plane c = new Plane();
        Plane d = new Plane();

        FlyingCar e = new FlyingCar();
        Car f = new Car();


        List<Flyable> airport = new ArrayList<>();
        airport.add(a);
        airport.add(b);
        airport.add(c);
        airport.add(d);
        airport.add(e);
//        airport.add(f);

        d.takeOff();
        e.changeHeight();
    }
}
