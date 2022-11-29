
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class SmartStrategy implements OrderingStrategy{
    List<List> orders = new ArrayList<>();
    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        if (bar.isHappyHour())
            bar.order(drink, recipe);
        else {
            List<Object> order = Arrays.asList(drink, recipe, bar);
            orders.add(order);
        }
    }

    @Override
    public void happyHourStarted(StringBar bar) {
        for (List<Object> order : orders){
            if (order.get(2) == bar) {
                bar.order((StringDrink) order.get(0), (StringRecipe) order.get(1));
            }
        }
    }

    @Override
    public void happyHourEnded(StringBar bar) {

    }
}
