package Chapter5.classpart;

public class Practice1_Person {
    public static void main(String[] args) {
        Person James = new Person();
        James.name = "James";
        James.age = 22;
        James.married = true;
        James.numberOfChildren = 2;

        System.out.println("James의 나이 = " + James.age);
        System.out.println("James의 이름 = " + James.name);
        System.out.println("James의 결혼 여부 = " + James.married);
        System.out.println("James의 자녀 수 = " + James.numberOfChildren);
    }
}