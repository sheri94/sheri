package KataCalc;
import KataCalc.*;

import java.security.MessageDigest;

public class Tests {

    enum Roma {
        I, II, III, IV, V, VI, VII, VIII, IX, X, XI, XII, XIII, XIV, XV, XVI, XVII, XVIII, XIX, XX, XXI,
        XXII, XXIII, XXIV, XXV, XXVI, XXVII, XXVIII, XXIX, XXX, XXXI, XXXII, XXXIII, XXXIV, XXXV, XXXVI,
        XXXVII, XXXVIII, XXXIX, XL, XLI, XLII, XLIII, XLIV, XLV, XLVI, XLVII, XLVIII, XLIX, L, LI, LII,
        LIII, LIV, LV, LVI, LVII, LVIII, LIX, LX, LXI, LXII, LXIII, LXIV, LXV, LXVI, LXVII, LXVIII, LXIX,
        LXX, LXXI, LXXII, LXXIII, LXXIV, LXXV, LXXVI, LXXVII, LXXVIII, LXXIX, LXXX, LXXXI, LXXXII, LXXXIII,
        LXXXIV, LXXXV, LXXXVI, LXXXVII, LXXXVIII, LXXXIX, XC, XCI, XCII, XCIII, XCIV, XCV, XCVI, XCVII, XCVIII,
        XCIX, C;

        int romaOfArab(String r1, String r2){


            return 0;
        }

        }


        public static void main(String[] args) throws Exception {
        String a = "VIII";
        String b = "L";
        int a1 = Roma.valueOf(a).ordinal()+1;
        int a2 = Roma.valueOf(b).ordinal()+1;

        int summa = a1+a2;
        Roma s1 = Roma.values()[summa];

            System.out.println(a1);
            System.out.println(a2);
            System.out.println(s1);

        }
        }



