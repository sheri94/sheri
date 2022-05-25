package Ls30;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {

    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}
class TestEmployee{
    void printEmployee(Employee e){
        System.out.println("Имя работника: "+e.name+ ". Работает в департаменте "+e.department+
                " с зарплатой: "+ e.salary);
    }

    void filtracizRabotnocov(ArrayList<Employee> empArr, Predicate<Employee> t){
        for (Employee e: empArr){
            if(t.test(e)){
                printEmployee(e);
            }
        }
    }

    public static void main(String[] args) {


        Employee emp1 = new Employee("Vera", "Admin", 220_000);
        Employee emp2 = new Employee("Andrey", "IT", 350_000);
        Employee emp3 = new Employee("Evgeniy", "Ingener", 390_000);
        Employee emp4 = new Employee("Eva", "IT", 470_000);
        Employee emp5 = new Employee("EDima", "IT", 450_000);
        Employee emp6 = new Employee("Enrici", "IT", 190_000);
        Employee emp7 = new Employee("Vodila", "Vodila", 400_000);
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);
        empList.add(emp6);
        empList.add(emp7);


        TestEmployee te = new TestEmployee();

        te.filtracizRabotnocov(empList, (Employee emp) ->{return emp.department == "IT" && emp.salary>200_000;});
        System.out.println("___________________________________________");
        te.filtracizRabotnocov(empList, (Employee emp)-> {return emp.name.startsWith("E") && emp.salary != 450_000;});
        System.out.println("___________________________________________");
        te.filtracizRabotnocov(empList, (Employee emp)->{return emp.name ==emp.department;});
    }
}
