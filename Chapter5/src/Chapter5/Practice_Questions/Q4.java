package Chapter5.Practice_Questions;

public class Q4 {
    public static void main(String[] args){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3-i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2*i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}