package Chapter4.loopeexample;

public class Gugudan_Example {
    public static void main(String[] args){
        for (int dan = 3; dan <= 7; dan++){
            for (int times = 1; times <= 9; times++){
                System.out.println(dan + "X" + times + "=" + (dan * times));
            }
            System.out.println();
        }
    }
}
