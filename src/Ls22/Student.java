package Ls22;

public class Student {
    private StringBuilder name ;

    public StringBuilder getName() {
        return name;
    }

    public void setName(StringBuilder s) {
        if (s.length() < 3) {
            name = s;
            System.out.println("Имени Ян не существует");
        } else name = s;
    }

    private int course = 0;

    public int getCourse() {
        return course;
    }

    public void setCourse(int i) {
        if (i < 1) {
            course = i;
            System.out.println("У нас столько не учатся");
        } else if (i > 4) {
            course = i;
            System.out.println("У нас столько не учатся");
        } else course = i;
    }

    private double grade = 0;

    public double getGrade() {
        return grade;
    }

    public void setGrade(double d) {
        if (d < 1) {
            grade = d;
            System.out.println("Не верно указана оценка!");
        } else if (d > 10) {
            grade = d;
            System.out.println("Не верно указана оценка!");
        } else grade = d;
    }

    public void showInfo(StringBuilder sB, int i, double d) {
        setName(sB);
        setCourse(i);
        setGrade(d);
        System.out.println("Студент по имени: " + getName());
        System.out.println("Курс : " + getCourse());
        System.out.println("Средняя оценка: " + getGrade());
    }

}
