package Model;

public class Pencil extends Paper{

    private Category category;

    public Pencil() {
    }

    public Pencil(String name, Double price, Integer stock, Type type, Category category) {
        super(name, price, stock, type);
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Pencil{" +
                "category=" + category +
                '}';
    }

    @Override
    public Double calculatePrice(Double percentage){
        return getPrice() * percentage;
    }
}
