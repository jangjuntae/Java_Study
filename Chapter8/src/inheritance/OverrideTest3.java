package inheritance;

public class OverrideTest3 {
    public static void main(String[] args){
        int price = 10000;

        Customer customerLee = new Customer(10000, "이순신");
        System.out.println(customerLee.getCustomerName() + " 님이 지불해야 할 금액은 " + customerLee.calcPrice(price) + "입니다");

        VIPCustomer customerKim = new VIPCustomer(10010, "김유신", 12345);
        System.out.println(customerKim.getCustomerName() + " 님이 지불해야 할 금액은 " + customerKim.calcPrice(price) + "입니다");

        Customer vc = new VIPCustomer(10020, "나몰라", 2000);
        System.out.println(vc.getCustomerName() + " 님이 지불해야 할 금액은 " + vc.calcPrice(price) + "입니다");
    }
}
