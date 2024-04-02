package OOP_lesson_2;
import java.util.List;

public interface MarketBehaveour {
    void acceptToMarket(Actor actor);
    void releaseFromMarket(List<Actor> actors);

    void update();
}
