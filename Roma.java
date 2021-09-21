package New;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.*;

public enum Roma {
    I(1), IV(4), V(5), IX(9), X(10),
    XL(40), L(50), XC(90), C(100),
    CD(400), D(500), CM(900), M(1000);

private int arab;

    Roma(int arab){
        this.arab = arab;
    }
 public int getArab(){
        return  arab;
    }
public static List getReturnArab(){
        return stream(values())
                .sorted(Comparator.comparing((Roma e)-> e.arab).reversed())
                .collect(Collectors.toList());
}

    public static int romanToArabic(String input) {
        String romanNumeral = input.toUpperCase();
        int result = 0;

        List romanNumerals = Roma.getReturnArab();

        int i = 0;

        while ((romanNumeral.length() > 0) && (i < romanNumerals.size())) {
            Roma symbol = (Roma) romanNumerals.get(i);
            if (romanNumeral.startsWith(symbol.name())) {
                result += symbol.getArab();
                romanNumeral = romanNumeral.substring(symbol.name().length());
            } else {
                i++;
            }
        }

        if (romanNumeral.length() > 0) {
            throw new IllegalArgumentException(input + " cannot be converted to a Roman Numeral");
        }

        return result;
    }
}
