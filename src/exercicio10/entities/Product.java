package exercicio10.entities;

public class Product {
    private Integer id;
    private String name;
    private Integer quantity;

    public Product(Integer id, String name, Integer quantity){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public Integer getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public Integer getQuantity(){
        return quantity;
    }

    public void setQuantity(Integer amount){
        quantity += amount;
    }

    public String toString(){
        return "Id: " + id + ", Name: " + name + ", Quantity: " + quantity;
    }
}
