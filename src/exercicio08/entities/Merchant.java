package exercicio08.entities;

public class Merchant {
    private String name;
    private Product [] products;

    public Merchant(String name, int productQuantity){
        this.name = name;
        this.products = new Product[productQuantity];
    }

    public String getName(){
        return name;
    }

    public Product[] getProducts() {
        return products;
    }

    public double getTotalPurchase(){
        double sum = 0.0;
        for(Product p : products){
            sum+= p.getPurchasePrice();
        }        
        return sum;
    }

    public double getTotalSale(){
        double sum = 0.0;
        for(Product p : products){
            sum += p.getSalePrice();
        }
        return sum;
    }

    public double getTotalProfit(){
        return getTotalSale() - getTotalPurchase();
    }
}
