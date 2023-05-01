package ch04;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bonusPoint = 1000;
        int priceLee = customerLee.calcPrice(1000);
        System.out.println(customerLee.showCustomerInfo());
        System.out.println(priceLee);

        VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
        customerKim.bonusPoint = 10000;
        int priceKim = customerKim.calcPrice(1000);
        System.out.println(customerKim.showCustomerInfo());
        System.out.println(priceKim);

        Customer vc = new VIPCustomer(12345, "Noname");
        System.out.println(vc.calcPrice(1000));
    }
}