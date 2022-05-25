package Ls22;

public class Test {

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.showInfo(new StringBuilder("Дима"), 2, 8.2);
        System.out.println();
        Student st2 = new Student();
        st1.showInfo(new StringBuilder("Ян"), 5, 8.2);
        System.out.println();
        Student st3 = new Student();
        st1.showInfo(new StringBuilder("Андрей"), 4, 10.01);
    }
}
