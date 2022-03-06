package KataCalc;

import java.util.regex.Pattern;

public class Mains {
}

//решение должно содержать данный класс
class Main {
    String result;

    //Решение должно содержать данный метод
    public String calc(String inputString) throws Exception {
        String primer = inputString.replaceAll("\\s*", "").toUpperCase();

        //извлечение цифр, разделитель знаки
        Pattern pNum = Pattern.compile("[+\\-*/]");
        String[] strings = pNum.split(primer, 2);

        //извлечение знака, разделитель цифры или буквы
        Pattern pChar = Pattern.compile("[0-9a-zA-Z]*");
        String[] stringsChar = pChar.split(primer);
        String c = String.valueOf(stringsChar[2]);



        if ((strings[0].contains("I") || strings[0].contains("V") || strings[0].contains("X")) &&
                (strings[1].contains("I") || strings[1].contains("V") || strings[1].contains("X"))) {

            int a = Roma.valueOf(strings[0]).ordinal() + 1;
            int b = Roma.valueOf(strings[1]).ordinal() + 1;
            int resultRoma ;
            Roma convertRoma;
            switch (c) {

                case ("+"):
                    resultRoma = a + b;
                    result = Roma.values()[resultRoma - 1].toString();
                    break;
                case ("-"):
                    resultRoma = a - b;
                    result = Roma.values()[resultRoma - 1].toString();
                    break;
                case ("*"):
                    resultRoma = a * b;
                    result = Roma.values()[resultRoma - 1].toString();
                    break;
                case ("/"):
                    resultRoma = a / b;
                    result = Roma.values()[resultRoma - 1].toString();
                    break;
            }
        } else {
            int a = Integer.parseInt(strings[0]);
            int b = Integer.parseInt(strings[1]);
            Integer resultSumm;
            if ((a > 10 || a <= 0) || (b > 10 || b <= 0)) {
                throw new Exception();
            }
            switch (c) {
                case ("+"):
                    resultSumm = a + b;
                    result = resultSumm.toString();
                    break;
                case ("-"):
                    resultSumm= a - b;
                    result = resultSumm.toString();
                    break;
                case ("*"):
                    resultSumm = a * b;
                    result = resultSumm.toString();
                    break;
                case ("/"):
                    resultSumm = a / b;
                    result = resultSumm.toString();
                    break;
            }
        }


        return result;
    }



    public static void main(String[] args) throws Exception {

        Main m = new Main();
        m.calc("x + v");
        System.out.println(m.result);

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
}
