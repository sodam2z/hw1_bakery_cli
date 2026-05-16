public class Coffee extends Beverage {
    private Boolean is_iced;
    public Coffee(boolean is_iced)  {
        super("커피", 3500);
        this.is_iced = is_iced;
    }

}
