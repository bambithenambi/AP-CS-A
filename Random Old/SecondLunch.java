public class SecondLunch extends Time{
    public SecondLunch() {
        super(12, 20, 0)
    }
    public void endOfLunch() {
        this.hour = 1;
        this.minute = 5;
        this.second = 0;
    }
}
