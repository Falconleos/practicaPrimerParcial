import Model.*;
import Service.ServiceProduct;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ServiceProduct serviceProduct = new ServiceProduct();

        Product fiction = new Fiction("Cuentos1",20.0,30,Type.BOOK, Genre.MISTERY);
        Product noFiction = new NoFiction("Cuentazos",35.0,25,Type.BOOK,Theme.SCIENCE);
        Product pencil = new Pencil("Lapiz rojo",5.0,100,Type.PAPPER,Category.HB);
        Product notebook = new Notebook("rings",10.0,43,Type.PAPPER,48);

        serviceProduct.addProduct(fiction);
        serviceProduct.addProduct(noFiction);
        serviceProduct.addProduct(pencil);
        serviceProduct.addProduct(notebook);

        serviceProduct.showData();

        serviceProduct.applyOffer(50.0);

        serviceProduct.newPrice();

    }
}