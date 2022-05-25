package Ls14;

public class Loop {
    public static void hoursMinutesSeconds() {

        HOURS:
        for (int hours = 0; hours < 6; hours++) {
            System.out.println("Start loop");
            MINUTES:
            for (int minutes = 0; minutes < 60; minutes++) {
                if (hours > 1 && minutes % 10 == 0) {
                    break HOURS;
                }
                SECONDS:
                for (int seconds = 0; seconds < 60; seconds++) {
                    System.out.println(hours + ":" + minutes + ":" + seconds + "sec");
                    if (hours * seconds == minutes) {
                        continue MINUTES;
                    }
                }
                System.out.println("end Sec");
            }
            System.out.println("End Min");
        }

    }

    public static void main(String[] args) {
        hoursMinutesSeconds();

    }
}

