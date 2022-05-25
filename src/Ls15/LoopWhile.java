package Ls15;

public class LoopWhile {

    public static void vremya() {
        int chas = 0;
        CHAS:
        while (chas < 6) {
            int min = 0;
            MIN:
            while (min < 60) {
                int sec = 0;
                SEC:
                do {
                    if (sec*chas>min){
                        continue ;
                    }
                    System.out.println(chas + ":" + min + ":" + sec);
                    sec++;

                } while (sec < 60);
                min++;
                if (chas > 1 && min % 10 == 0) {
                    break CHAS;
                }
            }
            chas++;

        }
    }

    public static void main(String[] args) {
        vremya();
    }
}