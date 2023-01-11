package abstractex;

public class DeskTop extends Computer{
    @Override
    public void display(){
        System.out.println("DeskTop display()");
    }
    public void typing(){
        System.out.println("DeskTop typing()");
    }
}