import org.w3c.dom.ls.LSOutput;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    double salaryX() {
        return salary *= 2;
    }
    void info(){
        System.out.println("Приказываю, в этом финансовом году для сотрудника " + surname+
                " в возрасте "+ age+ " с индентификационным номером " + id+ " работающего в департаменте "
        +department+ " увеличить зарплаут в двое. Итоговая зарпллата: "+ salaryX());
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee st1 = new Employee(789, "Dimas", 27, 25_685.98, "Java дрочер");
        Employee st2 = new Employee(897, "Andrey", 27, 40_660.12, "тоже Java дрочер");
        st1.info();
        st2.info();
    }
}
