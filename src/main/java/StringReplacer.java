public class StringReplacer implements StringTransformer{
    private char toChangeChar;
    private char newChar;

    public StringReplacer(char a, char b) {
        this.toChangeChar = a;
        this.newChar = b;
    }
    @Override
    public void execute(StringDrink drink) {
        String text = drink.getText();
        drink.setText(text.replace(toChangeChar, newChar));
    }
}
