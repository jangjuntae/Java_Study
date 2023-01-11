package Chapter4.loopeexample;

public class SwitchCase_example {
    public static void main(String[] args){
        int ranking = 5;

        switch (ranking){
            case 1:
                System.out.println(ranking + "층 약국입니다");
                break;
            case 2:
                System.out.println(ranking + "층 정형외과입니다");
                break;
            case 3:
                System.out.println(ranking + "층 피부과입니다");
                break;
            case 4:
                System.out.println(ranking + "층 치과입니다");
                break;
            case 5:
                System.out.println(ranking + "층 헬스 클럽입니다");
                break;
        }
    }
}
