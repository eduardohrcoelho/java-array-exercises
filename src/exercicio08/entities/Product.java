package exercicio08.entities;

public class Product {
    private String productName;
    private double purchasePrice;
    private double salePrice;

    public Product(String name, double purchasePrice, double salePrice){
        this.productName = name;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
    }

    public String getProductName() {
        return productName;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public double getProfit(){
        return salePrice - purchasePrice;
    }
    
}
