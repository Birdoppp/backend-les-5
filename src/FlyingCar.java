public class FlyingCar extends Vehicle implements Flyable,Drivable {
    @Override
    public void accelerate() {
        System.out.println("Speed up");
    }

    @Override
    public void brake() {
        System.out.println("Slow down");
    }

    @Override
    public void changeGear() {
        System.out.println("Shift gear");
    }

    @Override
    public void takeOff() {
        System.out.println("Take off!");
    }

    @Override
    public void land() {
        System.out.println("Landing");
    }

    @Override
    public void changeHeight() {
        System.out.println("Changing height");
    }
}
