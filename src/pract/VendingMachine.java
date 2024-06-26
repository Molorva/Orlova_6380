package pract;

import java.util.ArrayList;
import java.util.List;

public abstract class VendingMachine {
    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public VendingMachine() {
        this.products = new ArrayList<>();
    }

    public void addProducts (List<Product> products){
        this.products.addAll(products);
    }

    public Product getProduct(String name){
        {
            for (Product product : getProducts()) {
                if(product.getName().equals(name)){
                    Product result = product;
                    getProducts().remove(product);
                    return result;
                }
            }
            System.out.println("No such product: " + name);
            return null;
        }
    };

    public List<Product> getProducts() {
        return products;
    }
}
