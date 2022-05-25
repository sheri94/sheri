package Ls8;

public class StaticClass {
    //первое задание!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    static int proizvedenieTrehChisel(int a, int b, int c) {
        return a * b * c;
    }

    static void delenieDvuhChisel(int c, int d) {
        System.out.println("При деление чисел " + c + " на " + d + " результат " + c / d);
        System.out.println("При деление чисел " + c + " на " + d + " остаток " + c % d);
    }

    //конец первого задания!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    //второе задание
    public static double PI = Math.PI;

    public double ploshadKruga(double radiusKruga) {
        return PI * Math.pow(radiusKruga,2);
    }

    public static double dlinaOkrujnosti(double radiusKruga){
        return 2*PI*radiusKruga;
    }
     public void getInfoKrug(double radiusKruga){
        System.out.println("Радиус круга = "+ radiusKruga);
         System.out.println("Площадь круга = "+ ploshadKruga(radiusKruga));
         System.out.println("Длина окружности = " + dlinaOkrujnosti(radiusKruga));
    }
    //конец второго задания
}

class Test {
    //певое задание!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    public static void main(String[] args) {
        StaticClass.delenieDvuhChisel(764, 345);
        StaticClass.proizvedenieTrehChisel(7, 7, 7);
        System.out.println("Результат работы метода \"proizvedenieTrehChisel\" " + " = " + StaticClass.proizvedenieTrehChisel(7, 7, 7));
    }
    //конец первого задния!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
}
//второе задание
class Test2{
    public static void main(String[] args) {
        StaticClass st = new StaticClass();
        st.getInfoKrug(6);
    }
    //конец второго задания
}
