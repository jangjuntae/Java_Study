package Practice_Coffee;

public class StarCoffee {
    int money;

    public StarCoffee(){

    }
    public String brewing(int money){
        this.money = money;
        if (money == 4000){
            return "스타벅스 아메리카노를 구입했습니다";
        }
        else{
            return money == 4300 ? "스타벅스 라떼를 구입했습니다" : null;
        }
    }
}
