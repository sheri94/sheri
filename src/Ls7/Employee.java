package Ls7;

public class Employee {
    private double salary;
    public String surname;
    int id;

    //Методы
    public void infoSalary() {
        System.out.println("Зарплата сотрудника: " + salary);
    }

    public void infoSurname() {
        System.out.println("Имя сотрудника: " + surname);
    }

    public void infoId() {
        System.out.println("Идентификационный номер сотрудника: " + id);
    }

    //Конструкторы
    public Employee() {

    }

    public Employee(String surname) {
        this.surname = surname;
    }

    Employee(int id) {
        this.id = id;
    }

    private Employee(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.salary = 120_000.89;
        emp1.infoSalary();
    }
}

class TestEmp1 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.surname = "Alena";
        emp1.infoSurname();
        emp1.id = 10;
        emp1.infoId();

    }
}

