package Ls12;

import Ls6.Student;

public class StudentTest {
    Student nS1 = new Student(1, "Dima", "Polak", 4);
    Student nS2 = new Student(2, "Andrey", "Volsky", 5);
    Student nS3 = new Student(1, "Dima", "Polak", 5);


    void sravnenieStudentov1(Student s1, Student s2) {
        if (s1.id == s2.id && s1.name.equals(s2.name) && s1.lastName.equals(s2.lastName) && s1.course == s2.course) {
            System.out.println("Это один и тот же студент");
        } else {
            System.out.println("Это разные студенты");
        }
    }

    void sravnenieStudentov2(Student s1, Student s2) {
        if (s1.id == s2.id) {
            if (s1.name.equals(s2.name)) {
                if (s1.lastName.equals(s2.lastName)) {
                    if (s1.course == s2.course) {
                        System.out.println("Студенты ровны!");
                    } else {
                        System.out.println("Курсы у студентов разные");
                    }
                } else {
                    System.out.println("Фамилии студентов не совпадают");
                }

            } else {
                System.out.println("Имена судентов не равны");
            }
        } else {
            System.out.println("Ади студентов не ровно");
        }



    }

    public static void main(String[] args) {
        StudentTest st = new StudentTest();
        st.sravnenieStudentov2(st.nS1, st.nS3);
    }
}