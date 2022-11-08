public class StringInverter implements StringTransformer{

    @Override
    public void execute(StringDrink drink) {
        String text = drink.getText();
        String newText = "";
        for (int i = 0; i < text.length(); i++) {
            newText = newText.concat(String.valueOf(text.charAt(text.length() - 1 - i)));
        }
        drink.setText(newText);
    }
}
