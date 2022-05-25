package Ls28;

public class Test1 {

    public static void main(String[] args) throws Exception {
        Tiger tiger = new Tiger();
        tiger.eat("мясо");

        try {
            tiger.drink("Вода");
            try {
                tiger.drink("Пиво");
            }catch (NeVodaException e){

            }
        }catch (Exception e){

        }
         finally {
            System.out.println("Это блок инициализации файнали");
        }
    }
}

class NeMyasoException extends RuntimeException {
    NeMyasoException(String s) {
        super(s);
        System.out.println("Тигр не ест " + s);
    }
}

class NeVodaException extends Exception {
    NeVodaException(String s) {
        super(s);
        System.out.println("Тигр не пьет " + s);
    }
}

class Tiger {

    String eat(String s)  {
        String defEat = "МЯСО";
        if (s.toUpperCase().equals(defEat)) {
            System.out.println("Тигр ест мясо");
        } else {throw new NeMyasoException(s);
        }
        return s;
       }

    String drink(String s) throws Exception {
        String defDrink = "ВОДА";
        if (s.toUpperCase().equals(defDrink)) {
            System.out.println("Тигр пьет воду");
        } else {throw new NeVodaException(s);
        }
        return s;
    }

}