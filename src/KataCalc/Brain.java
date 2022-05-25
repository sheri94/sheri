package Calculator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Brain {

    public static void regex() throws Exception {
        Scanner in = new Scanner(System.in);
        String primer = in.nextLine().replaceAll("\\s*", "").toUpperCase();

        //извлечение цифр, разделитель знаки
        Pattern pNum = Pattern.compile("[%+\\-*/]");
        String[] strings = pNum.split(primer, 2);

        //извлечение знака, разделитель цифры или буквы
        Pattern pChar = Pattern.compile("[0-9a-zA-Z]*");
        String[] stringsChar = pChar.split(primer);
        String c = String.valueOf(stringsChar[2]);

        //System.out.println(c);
        if ((strings[0].contains("I") || strings[0].contains("V") || strings[0].contains("X")) &&
                (strings[1].contains("I") || strings[1].contains("V") || strings[1].contains("X"))) {
            Roma.arithmeticRoma(strings[0], strings[1], c);
        } else arithmeticArab(strings[0], strings[1], c);


    }

    static void arithmeticArab(String stNum1, String stNum2, String c)throws Exception {
        int a = Integer.parseInt(stNum1);
        int b = Integer.parseInt(stNum2);
        if ((a > 10 || a <= 0) || (b > 10 || b <= 0)) {
            throw new Exception();
        }
        switch (c) {
            case ("+"):
                System.out.println(a + b);
                break;
            case ("-"):
                System.out.println(a - b);
                break;
            case ("*"):
                System.out.println(a * b);
                break;
            case ("/"):
                System.out.println(a / b);
                break;
            case ("%"):
                System.out.println("Остаток :" + a % b);
                break;
        }
    }


    enum Roma {
        I, II, III, IV, V, VI, VII, VIII, IX, X, XI, XII, XIII, XIV, XV, XVI, XVII, XVIII, XIX, XX, XXI,
        XXII, XXIII, XXIV, XXV, XXVI, XXVII, XXVIII, XXIX, XXX, XXXI, XXXII, XXXIII, XXXIV, XXXV, XXXVI,
        XXXVII, XXXVIII, XXXIX, XL, XLI, XLII, XLIII, XLIV, XLV, XLVI, XLVII, XLVIII, XLIX, L, LI, LII,
        LIII, LIV, LV, LVI, LVII, LVIII, LIX, LX, LXI, LXII, LXIII, LXIV, LXV, LXVI, LXVII, LXVIII, LXIX,
        LXX, LXXI, LXXII, LXXIII, LXXIV, LXXV, LXXVI, LXXVII, LXXVIII, LXXIX, LXXX, LXXXI, LXXXII, LXXXIII,
        LXXXIV, LXXXV, LXXXVI, LXXXVII, LXXXVIII, LXXXIX, XC, XCI, XCII, XCIII, XCIV, XCV, XCVI, XCVII, XCVIII,
        XCIX, C;

        static void arithmeticRoma(String r1, String r2, String c) {
            int a = Roma.valueOf(r1).ordinal()+1;
            int b = Roma.valueOf(r2).ordinal()+1;

            switch (c) {

                case ("+"):
                    int resultRoma = a+b;
                    System.out.println(Roma.values()[resultRoma-1]);
                    break;
                case ("-"):
                    resultRoma = a-b;
                    System.out.println(Roma.values()[resultRoma-1]);
                    break;
                case ("*"):
                    resultRoma = a*b;
                    System.out.println(Roma.values()[resultRoma-1]);
                    break;
                case ("/"):
                    resultRoma = a/b;
                    System.out.println(Roma.values()[resultRoma-1]);
                    break;
                case ("%"):
                    resultRoma = a%b;
                    System.out.println(Roma.values()[resultRoma-1]);
                    break;
            }
            System.exit(1);
        }
    }

    public static void main(String[] args) throws Exception {

        regex();


    }
}
