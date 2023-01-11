package Practice_Card;

public class CardCompanyTest {
    public CardCompanyTest(){

    }
    public static void main(String[] args){
        CardCompany company = CardCompany.getInstance();
        Card myCard = company.createCard();
        Card yourCard = company.createCard();
        System.out.println(myCard.getCardNum());
        System.out.println(yourCard.getCardNum());
    }
}