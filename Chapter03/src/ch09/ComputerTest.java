package ch09;

public class ComputerTest {
    public static void main(String[] args) {
        Computer desktop = new Desktop();
        desktop.turnOn();
        desktop.display();
        desktop.turnOff();
    }
}