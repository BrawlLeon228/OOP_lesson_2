package OOP_lesson_2;

public abstract class Actor implements ActorBehaviour{
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public Actor(String name) {
        this.isMakeOrder = false;
        this.isTakeOrder = false;
        this.name = name;
    }


    //abstract String getName();
}
