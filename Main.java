package OOP_lesson_2;
public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("1");
        Human human2 = new Human("2");
        Human human3 = new Human("3");

        Market market = new Market();
        market.acceptToMarket(human1);
        market.update();
        
        market.acceptToMarket(human2);
        market.acceptToMarket(human3);
        market.update();
    }
}
