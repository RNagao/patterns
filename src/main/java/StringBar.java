public class StringBar extends Bar{
    private boolean happyHour = false;
    @Override
    public boolean isHappyHour() {
        return this.happyHour;
    }

    @Override
    public void startHappyHour() {
        this.happyHour = true;
        this.notifyObservers();
    }

    @Override
    public void endHappyHour() {
        this.happyHour = false;
        this.notifyObservers();
    }
}
