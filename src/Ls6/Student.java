package Ls6;

public class Student {
    public int id;
    public String name;
    public String lastName;
    public int course;
    double match;
    double ekonomic;
    double inostrani;

     Student(int id, String name, String lastName, int course, double match, double ekonomic, double inostrani) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.course = course;
        this.match = match;
        this.ekonomic = ekonomic;
        this.inostrani = inostrani;
    }
    public Student(int id, String name, String lastName, int course){
        this(id,name,lastName,course,0.0,0.0,0.0);

    }
     Student(){

    }
    public Student(int id, String name){
         this(id,name,null,0,0.0,0.0,0.0);
    }
    public Student(String name){
        this(0,name,null,0,0.0,0.0,0.0);
    }

    void info() {
        System.out.println("Средняя оценка " + name + " " + lastName + " по всем предметам: " + (ekonomic + match + inostrani) / 3);
    }
}

class StudentTest {


    public static void main(String[] args) {
        Student st1 = new Student();
        st1.id = 1;
        st1.name = "Andrey";
        st1.lastName = "Volsky";
        st1.course = 2022;
        st1.match = 4.27;
        st1.ekonomic = 3.65;
        st1.inostrani = 3.34;
        Student st2 = new Student();
        st2.id = 1;
        st2.name = "Alena";
        st2.lastName = "Volskaya";
        st2.course = 2021;
        st2.match = 4.27;
        st2.ekonomic = 4.65;
        st2.inostrani = 3.34;
        Student st3 = new Student();
        st3.id = 1;
        st3.name = "Dima";
        st3.lastName = "Polacov";
        st3.course = 2021;
        st3.match = 4.38;
        st3.ekonomic = 3.75;
        st3.inostrani = 4.34;
        st1.info();
        st2.info();
        st3.info();
        Student st4 = new Student (1,"Andrey","Volsky", 3, 7.5,5.6,8.9);
        st4.info();
        Student st5 = new Student(5,"Tolua", "Belioglov", 1);
        st5.match = 6.4;
        st5.ekonomic = 7.6;
        st5.inostrani = 4.9;
        st5.info();
    }
}
