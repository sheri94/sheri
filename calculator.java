import java.util.Scanner;
import java.util.regex.Pattern;

public class calculator {
    public calculator() {
    }

    public static void main(String[] args) {
        System.out.println("Введите все символы через пробел и нажмите Enter");
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        Pattern pattern = Pattern.compile("[ ]");
        String[] strings = pattern.split(text);
        int a = Integer.parseInt(strings[0]);
        char z = strings[1].charAt(0);
        int b = Integer.parseInt(strings[2]);

       

        if (a > 10 || b > 10) {
            System.exit(0);
        }

        if (z == '+') {
            System.out.println(a + b);
        } else if (z == '-') {
            System.out.println(a - b);
        } else if (z == '*') {
            System.out.println(a * b);
        } else if (z == '/') {
            System.out.println(a / b);
        } else {
            System.exit(0);
        }

    }
