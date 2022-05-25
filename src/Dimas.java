import java.util.*;
public class Dimas {
}
//Ты можешь добавлять свои импорты

//решение должно содержать данный класс
class Main {
    static int c;
    static int d;
    String result;

    public String calc(String inputString) throws Exception {
        String input = inputString.replace(" ", "");

        if (input.contains("+") || input.contains("-") || input.contains("*") || input.contains("/")) {
            if (input.contains("1") || input.contains("2") || input.contains("3") || input.contains("4") || input.contains("5") || input.contains("6") || input.contains("7") || input.contains("8") || input.contains("9") || input.contains("10") && input.contains("+") && input.contains("-") && input.contains("*") && input.contains("/")) {

                if (input.contains("+")) {

                    String[] b = input.split("\\+");
                    if (b.length > 2 || input.contains("0")) {
                        throw new Exception();
                    }
                    int[] b1 = new int[b.length];
                    try {
                        for (int i = 0; i < b.length; i++) {
                            b1[i] = Integer.parseInt(b[i]);
                        }
                    } catch (Exception e) {
                        throw new Exception();
                    }
                    c = b1[0];
                    d = b1[1];
                    if (c > 10 || d > 10) {
                        throw new Exception();
                    }
                    Integer ezy = c + d;
                    String pochti = ezy.toString();
                    result = pochti;
                }
                if (input.contains("-")) {
                    String[] b = input.split("\\-");
                    if (b.length > 2) {
                        throw new Exception();
                    }
                    int[] b1 = new int[b.length];
                    try {
                        for (int i = 0; i < b.length; i++) {
                            b1[i] = Integer.parseInt(b[i]);
                        }
                    } catch (Exception e) {
                        throw new Exception();
                    }
                    c = b1[0];
                    d = b1[1];
                    if (c > 10 || d > 10) {
                        throw new Exception();
                    }
                    Integer ezy = c - d;
                    String pochti = ezy.toString();
                    result = pochti;
                }
                if (input.contains("*")) {
                    String[] b = input.split("\\*");
                    if (b.length > 2) {
                        throw new Exception();
                    }
                    int[] b1 = new int[b.length];
                    try {
                        for (int i = 0; i < b.length; i++) {
                            b1[i] = Integer.parseInt(b[i]);
                        }
                    } catch (Exception e) {
                        throw new Exception();
                    }
                    c = b1[0];
                    d = b1[1];
                    if (c > 10 || d > 10) {
                        throw new Exception();
                    }
                    Integer ezy = c * d;
                    String pochti = ezy.toString();
                    result = pochti;
                }
                if (input.contains("/")) {
                    String[] b = input.split("\\/");
                    if (b.length > 2) {
                        throw new Exception();
                    }
                    int[] b1 = new int[b.length];
                    try {
                        for (int i = 0; i < b.length; i++) {
                            b1[i] = Integer.parseInt(b[i]);
                        }
                    } catch (Exception e) {
                        throw new Exception();
                    }
                    c = b1[0];
                    d = b1[1];
                    if (c > 10 || d > 10) {
                        throw new Exception();
                    }
                    Integer ezy = c / d;
                    String pochti = ezy.toString();
                    result = pochti;
                }
            } else if (input.contains("I") || input.contains("II") || input.contains("III") || input.contains("IV") || input.contains("V") || input.contains("VI") || input.contains("VII") || input.contains("VIII") || input.contains("IX") || input.contains("X") && input.contains("+") && input.contains("-") && input.contains("*") && input.contains("/")) {
                if (input.contains("+")) {
                    String[] array = input.split("\\+");
                    if (array.length > 2) {
                        throw new Exception();
                    }
                    RomeNumber leftNumber = RomeNumber.valueOf(array[0]);
                    RomeNumber rightNumber = RomeNumber.valueOf(array[1]);
                    Integer summa = leftNumber.ordinal() + rightNumber.ordinal();
                    if (leftNumber.ordinal() > 10 || rightNumber.ordinal() > 10) {
                        throw new Exception();
                    }
                    String pochti = String.valueOf(RomeNumber.values()[summa]);
                    result = pochti;
                }
                if (input.contains("-")) {
                    String[] array = input.split("\\-");
                    if (array.length > 2) {
                        throw new Exception();
                    }
                    RomeNumber leftNumber = RomeNumber.valueOf(array[0]);
                    RomeNumber rightNumber = RomeNumber.valueOf(array[1]);
                    Integer summa = leftNumber.ordinal() - rightNumber.ordinal();
                    if (leftNumber.ordinal() > 10 || rightNumber.ordinal() > 10) {
                        throw new Exception();
                    }
                    String pochti = String.valueOf(RomeNumber.values()[summa]);
                    result = pochti;
                }
                if (input.contains("*")) {
                    String[] array = input.split("\\*");
                    if (array.length > 2) {
                        throw new Exception();
                    }
                    RomeNumber leftNumber = RomeNumber.valueOf(array[0]);
                    RomeNumber rightNumber = RomeNumber.valueOf(array[1]);
                    Integer summa = leftNumber.ordinal() * rightNumber.ordinal();
                    if (leftNumber.ordinal() > 10 || rightNumber.ordinal() > 10) {
                        throw new Exception();
                    }
                    String pochti = String.valueOf(RomeNumber.values()[summa]);
                    result = pochti;
                }
                if (input.contains("/")) {
                    String[] array = input.split("\\/");
                    if (array.length > 2) {
                        throw new Exception();
                    }
                    RomeNumber leftNumber = RomeNumber.valueOf(array[0]);
                    RomeNumber rightNumber = RomeNumber.valueOf(array[1]);
                    Integer summa = leftNumber.ordinal() / rightNumber.ordinal();
                    if (leftNumber.ordinal() > 10 || rightNumber.ordinal() > 10) {
                        throw new Exception();
                    }
                    String pochti = String.valueOf(RomeNumber.values()[summa]);
                    result = pochti;
                }
            }
        } else {
            throw new Exception();
        }
        String result1 = result;
        return result1;
    }

}

enum RomeNumber {
    NOTHING, I, II, III, IV, V, VI, VII, VIII, IX, X, XI, XII, XIII, XIV, XV, XVI, XVII, XVIII, XIX,
    XX, XXI, XXII, XXIII, XXIV, XXV, XXVI, XXVII, XXVIII, XXIX, XXX, XXXI, XXXII, XXXIII, XXXIV, XXXV, XXXVI, XXXVII, XXXVIII, XXXIX,
    XL, XLI, XLII, XLIII, XLIV, XLV, XLVI, XLVII, XLVIII, XLIX, L, LI, LII, LIII, LIV, LV, LVI, LVII, LVIII, LIX,
    LX, LXI, LXII, LXIII, LXIV, LXV, LXVI, LXVII, LXVIII, LXIX, LXX, LXXI, LXXII, LXXIII, LXXIV, LXXV, LXXVI, LXXVII, LXXVIII, LXXIX,
    LXXX, LXXXI, LXXXII, LXXXIII, LXXXIV, LXXXV, LXXXVI, LXXXVII, LXXXVIII, LXXXIX, XC, XCI, XCII, XCIII, XCIV, XCV, XCVI, XCVII, XCVIII, XCIX, C;
}