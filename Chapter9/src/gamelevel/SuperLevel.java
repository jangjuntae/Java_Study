package gamelevel;

public class SuperLevel extends PlayerLevel{
    @Override
    public void run(){
        System.out.println("빨리 달립니다");
    }
    @Override
    public void jump(){
        System.out.println("높이 점프합니다");
    }

    @Override
    public void turn(){
        System.out.println("한 바퀴 돕니다");
    }

    @Override
    public void showLevelMessage(){
        System.out.println("********** 고급자 레벨입니다 ************");
    }
}