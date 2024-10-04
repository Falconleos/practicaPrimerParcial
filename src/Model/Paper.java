package Model;

public abstract class Paper extends Product{

    public Paper() {
    }

    public Paper(String name, Double price, Integer stock, Type type) {
        super(name, price, stock, type);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Paper{}";
    }
}
