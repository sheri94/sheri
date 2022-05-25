public class OwerloadMetods {
    int summ() {
        int result = 0;
        System.out.println("Сумма всех чисел = " + result);
        return result;
    }

    int summ(int a) {
        int result = 0;
        System.out.println("Сумма всех чисел = " + result);
        return a;
    }

    int summ(int a, int b) {
        int result = a + b;
        System.out.println("Сумма всех чисел = " + result);
        return result;
    }

    int summ(int a, int b, int c) {
        int result = a + b + c;
        System.out.println("Сумма всех чисел = " + result);
        return result;
    }

    int summ(int a, int b, int c, int d) {
        int result = a + b + c + d;
        System.out.println("Сумма всех чисел = " + result);
        return result;
    }

}
class test{
    public static void main(String[] args) {
        OwerloadMetods oM = new OwerloadMetods();

       oM.summ(1,6);
    }

}
