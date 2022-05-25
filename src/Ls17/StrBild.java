package Ls17;

public class StrBild {

    boolean ravenstvo(StringBuilder s1, StringBuilder s2) {
        boolean result = true;
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }

        return result;

    }

    public static void main(String[] args) {
        StrBild sb = new StrBild();
        StringBuilder sb1 = new StringBuilder("Привет");
        StringBuilder sb2 = new StringBuilder("Привет");
        StringBuilder sb3 = sb1.append(" Кыргыз");
        StringBuilder sb4 = sb1.append(" Кыргыз");
        System.out.println(sb.ravenstvo(sb1,sb3));
        System.out.println(sb1.length());
        System.out.println(sb2.length());
        System.out.println(sb3.length());

    }
}

