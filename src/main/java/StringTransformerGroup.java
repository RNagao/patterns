import java.util.List;

public class StringTransformerGroup implements StringTransformer{
    List<StringTransformer> transformers;
    public StringTransformerGroup(List<StringTransformer> list) {
        this.transformers = list;
    }

    @Override
    public void execute(StringDrink drink) {
        for (StringTransformer i: transformers){
            i.execute(drink);
        }
    }
}
