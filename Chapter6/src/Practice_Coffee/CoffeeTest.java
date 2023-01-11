package Practice_Coffee;

public class CoffeeTest {
    public CoffeeTest(){

    }

    public static void main(String[] args){
        Person kim = new Person("kim", 10000);
        StarCoffee starCoffee = new StarCoffee();
        BeanCoffee beanCoffee = new BeanCoffee();
        kim.buyStarCoffee(starCoffee, Menu.STARAMERICANO);
        kim.buyBeanCoffee(beanCoffee, Menu.BEANLATTE);
    }
}