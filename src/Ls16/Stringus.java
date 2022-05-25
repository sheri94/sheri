package Ls16;

public class Stringus {

    void email(String titleMail) {
        char c1;
        for (int i = 0; i < titleMail.length(); i++) {
            c1 = titleMail.charAt(i);
            if (c1 == '@') {
                int a = titleMail.indexOf('@', i) + 1;
                int b = titleMail.indexOf('.' , i);
                System.out.println(titleMail.substring(a, b));
            }
        }
    }

    public static void main(String[] args) {
        Stringus st = new Stringus();
        st.email("andrey@mail.ru; andrey@vk.com; eksinon@gmail.ner");
    }
}
