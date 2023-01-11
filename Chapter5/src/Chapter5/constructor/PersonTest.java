package Chapter5.constructor;

public class PersonTest {
    public static void main(String[] args){
        Person personLee = new Person();
        personLee.name = "이순신";
        personLee.weight = 85.5F;
        personLee.height = 180.0F;

        Person personJang = new Person("장준태", 172, 75);
    }
}
