package class25;

public interface MoveAble {
    void move();

}
interface OwnAble{
    void own();
}

class Car implements MoveAble, OwnAble{

    @Override
    public void move() {
        System.out.println(" I can move");
    }

    @Override
    public void own() {
        System.out.println("You can own me");
    }
}

class  Dog implements MoveAble, OwnAble{

    @Override
    public void move() {
        System.out.println("I can move");
    }

    @Override
    public void own() {
        System.out.println("you can own me");
    }
}