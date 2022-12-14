import java.util.List;

public class StringRecipe {
    List<StringTransformer> transformers;

    public StringRecipe(List<StringTransformer> list) {
        this.transformers = list;
    }

    public void mix(StringDrink drink) {
        for (StringTransformer i : transformers) {
            i.execute(drink);
        }
    }

}
