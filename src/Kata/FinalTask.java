package Kata;

import java.util.*;
import java.util.function.Consumer;

public class FinalTask {

    interface IMessage<T> {
        String getFrom();

        String getTo();

        T getContent();
    }

    public static class MailMessage implements IMessage<String> {
        private String from;
        private String to;
        private String content;

        public MailMessage(String from, String to, String content) {
            this.from = from;
            this.to = to;
            this.content = content;
        }

        public final String getFrom() {
            return from;
        }

        public final String getTo() {
            return to;
        }

        public final String getContent() {
            return content;
        }
    }

    public static class Salary implements IMessage<Integer> {
        private String from;
        private String to;
        private Integer content;

        public Salary(String from, String to, Integer content) {
            this.from = from;
            this.to = to;
            this.content = content;
        }

        public final String getFrom() {
            return from;
        }

        public final String getTo() {
            return to;
        }

        public final Integer getContent() {
            return content;
        }
    }

    public static class MailService<T> implements Consumer<IMessage<T>> {
        private static class MyHashMap<K, V> extends HashMap<K, V> {
            @Override
            public V get(Object key) {
                V temp = super.get(key);
                try {
                    if (temp == null) temp = (V) Collections.emptyList();
                } catch (ClassCastException e) {
                }
                return temp;
            }
        }

        private Map<String, List<T>> mailBox;

        public MailService() {
            mailBox = new MyHashMap<>();
        }

        @Override
        public void accept(IMessage<T> t) {
            if (mailBox.containsKey(t.getTo())) {
                List<T> val;
                val = mailBox.get(t.getTo());
                val.add(t.getContent());
                mailBox.put(t.getTo(), val);
            } else {
                List<T> val;
                val = new LinkedList<>();
                val.add(t.getContent());
                mailBox.put(t.getTo(), val);
            }
        }

        public Map<String, List<T>> getMailBox() {
            return mailBox;
        }

        public static void main(String[] args) {
            // Random variables
            String randomFrom = "..."; // Некоторая случайная строка. Можете выбрать ее самостоятельно.
            String randomTo = "...";  // Некоторая случайная строка. Можете выбрать ее самостоятельно.
            int randomSalary = 100;  // Некоторое случайное целое положительное число. Можете выбрать его самостоятельно.

            // Создание списка из трех почтовых сообщений.
            MailMessage firstMessage = new MailMessage("Robert Howard", "H.P. Lovecraft", "This \"The Shadow over Innsmouth\" story is real masterpiece, Howard!");
            MailMessage secondMessage = new MailMessage("Jonathan Nolan", "Christopher Nolan", "Брат, почему все так хвалят только тебя, когда практически все сценарии написал я. Так не честно!");
            MailMessage thirdMessage = new MailMessage("Stephen Hawking", "Christopher Nolan", "Я так и не понял Интерстеллар.");


            List<MailMessage> messages = Arrays.asList(firstMessage, secondMessage, thirdMessage);


            // Создание почтового сервиса.
            MailService<String> mailService = new MailService<>();

// Обработка списка писем почтовым сервисом
            messages.stream().forEachOrdered(mailService);

            // Получение и проверка словаря "почтового ящика",
//   где по получателю можно получить список сообщений, которые были ему отправлены
            Map<String, List<String>> mailBox = mailService.getMailBox();


            // Создание списка из трех зарплат.
            Salary salary1 = new Salary("Facebook", "Mark Zuckerberg", 1);
            Salary salary2 = new Salary("FC Barcelona", "Lionel Messi", Integer.MAX_VALUE);
            Salary salary3 = new Salary(randomFrom, randomTo, randomSalary);

            // Создание почтового сервиса, обрабатывающего зарплаты.
            MailService<Integer> salaryService = new MailService<>();

// Обработка списка зарплат почтовым сервисом
            Arrays.asList(salary1, salary2, salary3).forEach(salaryService);

            // Получение и проверка словаря "почтового ящика",
//   где по получателю можно получить список зарплат, которые были ему отправлены.
            Map<String, List<Integer>> salaries = salaryService.getMailBox();

        }
    }
}
