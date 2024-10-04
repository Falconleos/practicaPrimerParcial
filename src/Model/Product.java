package Model;

public abstract class Product {

    protected static Integer contador = 0;

    private Integer id;
    private String name;
    private Double price;
    private Integer stock;
    private Type type;

    public Product() {
        this.id = contador++;
    }

    public Product(String name, Double price, Integer stock, Type type) {
        this.id = contador++;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.type = type;
    }


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", type=" + type +
                '}';
    }

   public abstract Double calculatePrice(Double percentage);

}
