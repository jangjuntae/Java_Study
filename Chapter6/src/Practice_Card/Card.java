package Practice_Card;

public class Card {
    public static int serialNum = 0;
    public int cardNum;

    public Card(){
        serialNum += 1;
        cardNum = serialNum;
    }

    public int getCardNum(){
        return cardNum;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }
}