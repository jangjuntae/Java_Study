package Chapter2;

public class TypeInference {
    public static void main(String[] args){
        var i = 10;
        var j = 10.0;
        var str = "Hello";

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        str = "Test"; // -> 다른 문자열로는 대입 가능
        // str = 3 *** 안됨
    }
}
