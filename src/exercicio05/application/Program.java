package exercicio05.application;

import java.util.Scanner;

import exercicio05.entities.Employee;

public class Program {
    
    /* Faça um programa para ler um número inteiro N e depois os dados (Id, Nome e Salário) de N funcionários. Não deve haver repetição de Ids. Depois, efetuar o amento de salário de um
     * determinado funcionário. Para isso, o programa deve ler um Id e o valor X do aumento em porcentagem. Se o Id informado não existir, mostrar uma mensagem e abortar a operação. Ao final,
     * mostrar a listagem atualizada dos funcionários.
     * 
     * Write a program to read an integer N and then the data (ID, Name, and Salary) of N employees. There should be no duplicate IDs. Then, increase the salary of a specific employee.
     * To do this, the program must read an ID and the percentage increase amount X. If the specified ID does not exist, display a message and abort the operation. 
     * Finally, display the updated list of employees.
     */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many employees will be registered: ");
        int n = scanner.nextInt();
        Employee vect[] = new Employee[n];
        Employee employee = new Employee();

        for(int i = 0; i < vect.length; i++){
            System.out.println("Employee #" + (i + 1));
            int id;
            while(true){
                System.out.print("Id: ");
                id = scanner.nextInt();
                if(hasId(vect, i, id)){
                    System.out.println("This ID already exist, please try again.");
                }else{
                    break;
                }
            }
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            vect[i] = new Employee(id, name, salary);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idToIncrease = scanner.nextInt();

        Employee emp = findEmployee(vect, idToIncrease);
        
        if(emp == null){
            System.out.print("Employee not found.\n");
        }else{
            System.out.print("Enter the percentage: ");
            double percentage = scanner.nextDouble();
            emp.increaseSalary(percentage, vect);
        }
        
        System.out.print("List of employees: \n");
        for(int i = 0; i < vect.length; i++){
            System.out.print(employee.toString(vect, i));
        }

        scanner.close();
    }

    public static boolean hasId(Employee vect[], int count, int id){
        for(int i = 0; i < count; i++){
            if(vect[i].getId() == id){
                return true;
            }
        }
        return false;
    }

    public static Employee findEmployee(Employee[] vect, int id) {
        for (int i = 0; i < vect.length; i++) {
            // Cuidado: só podemos acessar vect[i] se ele não for nulo!
            if (vect[i] != null && vect[i].getId() == id) {
                return vect[i];
            }
        }
        return null;
    }
}
