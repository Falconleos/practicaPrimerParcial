package Service;

import Interface.OfferProduct;
import Model.*;

import java.util.ArrayList;
import java.util.List;

public class ServiceProduct {

    private List<Product> inventary;

    public ServiceProduct() {
        this.inventary = new ArrayList<>();
    }

    public void addProduct(Product p){
        inventary.add(p);
    }

    public void showData(){

        for(Product p : inventary){
            System.out.println(p);
            System.out.println(p.getClass());
        }

    }

    public void applyOffer(Double percentage){

        for(Product p : inventary){
            Double precioOferta = 0d;

            if(p instanceof Fiction){
                precioOferta = ((Fiction) p).offer(percentage);
                System.out.println("Precio con oferta de " + p.getName() + ": " + precioOferta);
            }if(p instanceof Notebook){
                precioOferta = ((Notebook) p).offer(percentage);
                System.out.println("Precio con oferta de " + p.getName() + ": " + precioOferta);
            }
        }
    }

    public void newPrice(){

        for(Product p : inventary){
            Double percentage = 0d;
            Double oldPrice = 0d;
            if (!(p instanceof OfferProduct)){
                if (p instanceof NoFiction){
                    percentage = 1.05;
                    oldPrice = p.getPrice();
                }if (p instanceof Pencil){
                    percentage = 1.10;
                    oldPrice = p.getPrice();
                }
                p.setPrice(p.calculatePrice(percentage));
                System.out.println("Precio anterior de "+p.getName()+ " es: "+oldPrice +" y precio con aumento: "+p.getPrice());

            }
        }

    }


}
