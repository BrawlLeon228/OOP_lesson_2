package OOP_lesson_2;

public interface ActorBehaviour {
    void setMakeOrder(boolean isMakeOrder);
    void setTakeOrder(boolean isTakeOrder);
    
    String getName();
    boolean isMakeOrder();
    boolean isTakeOrder();
} 