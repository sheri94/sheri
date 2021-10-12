//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import com.sun.jdi.IntegerType;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class calculator {
    public calculator() {
    }

    public static void main(String[] args) {
        String message = "Введите все символы через пробел и нажмите Enter";
        System.out.println(message);
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        Pattern pattern = Pattern.compile("[ ]");
        String[] strings = pattern.split(text.toUpperCase());

        if ((strings[0].contains("I") || strings[0].contains("V") || strings[0].contains("X")) &&
                (strings[2].contains("I") || strings[2].contains("V") || strings[2].contains("X"))) {
            int x = RomanAndArab.convertRomanToArab(strings[0].trim());
            int y = RomanAndArab.convertRomanToArab(strings[2].trim());
            int result = 0;
            switch (strings[1]) {
                case ("+"):
                    result = x + y;
                    RomanAndArab.convertArabToRoman(result);
                    break;
                case ("-"):
                    result = x - y;
                    RomanAndArab.convertArabToRoman(result);
                    break;
                case ("*"):
                    result = x * y;
                    RomanAndArab.convertArabToRoman(result);
                    break;
                case ("/"):
                    result = x / y;
                    RomanAndArab.convertArabToRoman(result);
                    break;
            }

        } else {
            int a = Integer.parseInt(strings[0]);
            //  char z = strings[1].charAt(0);
            int b = Integer.parseInt(strings[2]);
            if (a <= 0 || a > 10 || b <= 0 || b > 10) {
                System.out.println("Одно из введеных чисел нарушает требование");
                System.exit(0);
            }
            switch (strings[1]) {
                case ("+"):
                    System.out.println("Ответ: " + (a + b));
                    break;
                case ("-"):
                    System.out.println("Ответ: " + (a - b));
                    break;
                case ("*"):
                    System.out.println("Ответ: " + (a * b));
                    break;
                case ("/"):
                    System.out.println("Ответ: " + (a / b));
                    break;
            }

        }
    }
}
