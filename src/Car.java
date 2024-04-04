public class Car extends Vehicle implements Drivable{

    @Override
    public void accelerate() {
        System.out.println("PLANKGAS!!");
    }

    @Override
    public void brake() {
        System.out.println("oh, was toch te snel");
    }

    @Override
    public void changeGear() {
        System.out.println("Even schakelen");
    }
}
