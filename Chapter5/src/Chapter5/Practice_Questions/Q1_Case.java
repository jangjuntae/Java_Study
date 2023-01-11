package Chapter5.Practice_Questions;

public class Q1_Case {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 2;
        char operator = '+';

        switch(operator){
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
        }
    }
}
