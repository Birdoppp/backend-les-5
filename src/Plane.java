public class Plane extends Vehicle implements Flyable{

    @Override
    public void takeOff() {
        System.out.println("3!..2!..1! Ready for Take-Off!");
    }

    @Override
    public void land() {
        System.out.println("Please fasten your seatbelts. We will prepare for landing");
    }

    @Override
    public void changeHeight() {
        System.out.println("Our altitude has changed");
    }
}
