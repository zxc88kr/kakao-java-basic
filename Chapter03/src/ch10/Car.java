package ch10;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();

    public void turnOnCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOffCar() {
        System.out.println("시동을 끕니다.");
    }
    
    public void washCar() {}

    public final void run() {
        turnOnCar();
        drive();
        stop();
        turnOffCar();
        washCar();
    }
}