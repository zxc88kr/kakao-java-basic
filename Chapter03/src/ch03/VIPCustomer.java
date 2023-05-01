package ch03;

public class VIPCustomer extends Customer {
    private String agentId;
    double salesRatio;

    /*
    public VIPCustomer() {
        super();

        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;

        System.out.println("VIPCustomer() is called");
    }
    */

    public VIPCustomer(int customerId, String customerName) {
        super(customerId, customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;

        System.out.println("VIPCustomer() is called");
    }

    public String getAgentId() {
        return agentId;
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return (int)(price * (1 - salesRatio));
    }
}