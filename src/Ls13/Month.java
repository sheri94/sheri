package Ls13;

public class Month {

    static void qtyDayOfMouth(int a) {
        switch (a) {
            case 1:
                System.out.println("Январь: Кол-во дней 31");
                break;
            case 2:
                System.out.println("Февраль: Кол-во дней 28");
                break;
            case 3:
                System.out.println("Март: Кол-во дней 31");
                break;
            case 4:
                System.out.println("Апрель: Кол-во дней 31");
                break;
            case 5:
                System.out.println("Май: Кол-во дней 31");
                break;
            case 6:
                System.out.println("Июнь: Кол-во дней 31");
                break;
            case 7:
                System.out.println("Июль: Кол-во дней 31");
                break;
            case 8:
                System.out.println("Август: Кол-во дней 31");
                break;
            case 9:
                System.out.println("Сентябрь: Кол-во дней 31");
                break;
            case 10:
                System.out.println("Октябрь: Кол-во дней 31");
                break;
            case 11:
                System.out.println("Ноябрь: Кол-во дней 31");
                break;
            case 12:
                System.out.println("Декабрь: Кол-во дней 31");
                break;

        }
    }

    public static void main(String[] args) {
qtyDayOfMouth(3);
    }
}
