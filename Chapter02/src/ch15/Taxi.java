package ch15;

public class Taxi {
    String taxiCompany;
    int passengerCount;
    int money;

    public Taxi(String taxiCompany) {
        this.taxiCompany = taxiCompany;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showTaxiInfo() {
        System.out.println(taxiCompany + " 회사 택시의 승객 수는 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다.");
    }
}