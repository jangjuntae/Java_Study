package Chapter5.classpart;

public class Practice2_ShoppingMall {
    public static void main(String[] args){
        ShoppingMall customer = new ShoppingMall();
        customer.number = "202203120001";
        customer.id = "abc123";
        customer.date = "2022년 9월 4일";
        customer.name = "장준태";
        customer.productNumber = "PD0345-12";
        customer.address = "전라북도 무주군 무주읍 당산강변로 224";

        System.out.println("주문 번호 : " + customer.number);
        System.out.println("주문자 아이디 : " + customer.id);
        System.out.println("주문 날짜 : " + customer.date);
        System.out.println("주문자 이름 : " + customer.name);
        System.out.println("주문 상품 번호 : " + customer.productNumber);
        System.out.println("배송 주소 : " + customer.address);
    }
}