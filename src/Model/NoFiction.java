package Model;

public class NoFiction extends Book{

    private Theme theme;

    public NoFiction() {
    }

    public NoFiction(String name, Double price, Integer stock, Type type, Theme theme) {
        super(name, price, stock, type);
        this.theme = theme;
    }

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    @Override
    public String toString() {
        return super.toString() +
                "NoFiction{" +
                "theme=" + theme +
                '}';
    }

    @Override
    public Double calculatePrice(Double percentage){
        return getPrice() * percentage;
    }

}

