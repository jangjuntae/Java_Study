package gamelevel;

public class BeginnerLevel extends PlayerLevel{
    @Override
    public void run(){
        System.out.println("천천히 달립니다");
    }
    @Override
    public void jump(){
        System.out.println("점프할 줄 몰랑");
    }

    @Override
    public void turn(){
        System.out.println("턴할 줄 말랑");
    }

    @Override
    public void showLevelMessage(){
        System.out.println("********** 초보자 레벨입니다 ************");
    }
}
