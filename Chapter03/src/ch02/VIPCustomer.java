package ch02;

public class VIPCustomer extends Customer {
    private String agentId;
    double salesRatio;

    public VIPCustomer() {
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }

    public String getAgentId() {
        return agentId;
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return (int)(price * (1 - salesRatio));
    }
}