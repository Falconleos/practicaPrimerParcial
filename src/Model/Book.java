package Model;

public abstract class Book extends Product {

    public Book() {
    }

    public Book(String name, Double price, Integer stock, Type type) {
        super(name, price, stock, type);
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Book{}";
    }

}
