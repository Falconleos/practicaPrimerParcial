package Model;

import Interface.OfferProduct;

public class Notebook extends Paper implements OfferProduct {

    private Integer pagineCant;

    public Notebook() {
    }

    public Notebook(String name, Double price, Integer stock, Type type, Integer pagineCant) {
        super(name, price, stock, type);
        this.pagineCant = pagineCant;
    }

    public Integer getPagineCant() {
        return pagineCant;
    }

    public void setPagineCant(Integer pagineCant) {
        this.pagineCant = pagineCant;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Notebook{" +
                "pagineCant=" + pagineCant +
                '}';
    }

    @Override
    public Double calculatePrice(Double percentage){
        return getPrice() * percentage;
    }

    @Override
    public Double offer(Double percentage){
        return getPrice() * (1-percentage/100);
    }

}
