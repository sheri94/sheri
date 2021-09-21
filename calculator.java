import New.Roma;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class calculator {
    public static void main(String[] args ) {

        System.out.println("Введите все символы через пробел и нажмите Enter");
            Scanner in = new Scanner(System.in);
            String text = in.nextLine();
            Pattern pattern = Pattern.compile("[ ]");
            String[] strings = pattern.split(text);
            int a = Integer.parseInt(strings[0]);
            char z = strings[1].charAt(0);
            int b = Integer.parseInt(strings[2]);

       Roma roma = Roma.valueOf(strings[0]);
       Roma roma1 =Roma.valueOf(strings[2]);



        if(a>10||b >10) {
                System.exit(0); // если число больше 10 то останавливает программу
            }
       /* System.out.println(a);
        System.out.println(z);
        System.out.println(b);*/
        if(z=='+') {
                System.out.println(a + b);}
        else if(z=='-') {
                System.out.println(a - b);}
        else if(z=='*') {
                System.out.println(a * b);}
        else if(z=='/') {
                System.out.println(a / b);}
        else {
                System.exit(0);}
        }
    }

