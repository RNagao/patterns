import java.util.ArrayList;
import java.util.List;

public class HumanClient implements Client{
    private List<Bar> openHappyHour = new ArrayList<>();
    private List<Bar> closeHappyHour = new ArrayList<>();
    private OrderingStrategy strategy;
    public HumanClient(OrderingStrategy strategy) {
        this.strategy = strategy;
    }
    @Override
    public void happyHourStarted(Bar bar) {
        openHappyHour.add(bar);
        strategy.happyHourStarted((StringBar) bar);
        closeHappyHour.remove(bar);
    }

    @Override
    public void happyHourEnded(Bar bar) {
        openHappyHour.remove(bar);
        closeHappyHour.remove(bar);
    }

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        strategy.wants(drink, recipe, bar);
    }
}
