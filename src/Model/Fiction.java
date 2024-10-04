package Model;

import Interface.OfferProduct;

public class Fiction extends Book implements OfferProduct {

    private Genre genre;

    public Fiction() {
    }

    public Fiction(String name, Double price, Integer stock, Type type, Genre genre) {
        super(name, price, stock, type);
        this.genre = genre;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Fiction{" +
                "genre=" + genre +
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
