package inheritance;

public class OverridingTest {
    public static void main(String[] args){
        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bonusPoint = 1000;

        VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 12345);
        customerKim.bonusPoint = 10000;

        int price = 10000;
        System.out.println(customerLee.customerName + " 님이 지불해야 할 급액은 " + customerLee.calcPrice(price) + "입니다");
        System.out.println(customerKim.customerName + " 님이 지불해야 할 금액은 " + customerKim.calcPrice(price) + "입니다");

        System.out.println(customerKim.bonusPoint);
        System.out.println(customerLee.bonusPoint);
    }
}
