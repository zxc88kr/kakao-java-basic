package ch14;

public class TakeTransTest {
    public static void main(String[] args) {
        Student studentJames = new Student("James", 5000);
        Student studentTomas = new Student("Tomas", 10000);

        Bus bus100 = new Bus(100);
        Subway greenSubway = new Subway(2);

        studentJames.takeBus(bus100);
        studentTomas.takeSubway(greenSubway);

        studentJames.showStudentInfo();
        studentTomas.showStudentInfo();

        bus100.showBusInfo();
        greenSubway.showSubwayInfo();
    }
}