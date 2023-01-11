package Chapter5.Practice_Questions;

public class Q3 {
    public static void main(String[] args){
        for(int dan = 2; dan <= 9; dan++){
            for(int times = 1; times <= 9; times++){
                if(times > dan){
                    break;
                }
                System.out.println(dan + "*" + times + "=" + (dan * times));
            }
            System.out.println();
        }
    }
}
