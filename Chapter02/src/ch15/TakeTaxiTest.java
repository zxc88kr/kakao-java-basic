package ch15;

public class TakeTaxiTest {
    public static void main(String[] args) {
        Student studentEdward = new Student("Edward", 20000);

        Taxi TaxiGood = new Taxi("잘나간다 운수");

        studentEdward.takeTaxi(TaxiGood);
        
        studentEdward.showStudentInfo();

        TaxiGood.showTaxiInfo();
    }
}