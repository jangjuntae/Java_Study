package Chapter5.Practice_Questions;

public class Q2 {
    public static void main(String[] args){
        for(int dan = 2; dan <= 9; dan++){
            if (dan % 2 == 1){
                continue;
            }
            for(int times = 1; times <=9; times++){
                System.out.println(dan + "*" + times + "=" + (dan * times));
            }
            System.out.println();
        }
    }
}
