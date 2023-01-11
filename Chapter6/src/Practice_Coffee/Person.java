package Practice_Coffee;

public class Person {
    public String name;
    public int money;


    public Person(String name, int money){
        this.name = name;
        this.money = money;
    }

    public void buyStarCoffee(StarCoffee sCoffee, int money){
        String message = sCoffee.brewing(4000);
        if (message != null) {
            this.money -= money;
            System.out.println(this.name + " 님이 " + money + "으로 " + message);
        }
    }

    public void buyBeanCoffee(BeanCoffee bCoffee, int money){
        String message = bCoffee.brewing(4500);
        this.money -= money;
        System.out.println(this.name + " 님이 " + money + "으로 " + message);
    }
}
