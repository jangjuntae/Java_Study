package cooperation;

public class Taxi {
    String taxiNumber;
    int money;
    int passengerCount;

    public Taxi(String taxiNumber){
        this.taxiNumber = taxiNumber;
    }
    public void take(int money){
        this.money += money;
        passengerCount++;
    }

    public void showInfo(){
        System.out.println("당신은 늦잠을 자는 바람에 택시를 타게 되었습니다. " + taxiNumber + "의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다");
    }
}