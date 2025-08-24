package exercicio05.entities;

public class Employee {
    private int id = 0;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public Employee(){
        
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void increaseSalary(double percentage, Employee vect[]){
        salary += salary*percentage/100.0;
    }

    public String toString(Employee vect[], int i){
        
        return vect[i].getId() + ", " + vect[i].getName() + ", " + String.format("%.2f%n", vect[i].getSalary());
    }
}
