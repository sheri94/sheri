package Kata;

import java.util.logging.Logger;

public class Pochta2 {

    /*
 Интерфейс: сущность, которую можно отправить по почте.
 У такой сущности можно получить от кого и кому направляется письмо.
 */
    public static interface Sendable {
        String getFrom();

        String getTo();
    }

    /*
Абстрактный класс,который позволяет абстрагировать логику хранения
источника и получателя письма в соответствующих полях класса.
*/
    public static abstract class AbstractSendable implements Sendable {

        protected final String from;
        protected final String to;

        public AbstractSendable(String from, String to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public String getFrom() {
            return from;
        }

        @Override
        public String getTo() {
            return to;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AbstractSendable that = (AbstractSendable) o;

            if (!from.equals(that.from)) return false;
            if (!to.equals(that.to)) return false;

            return true;
        }

    }

    /*
Письмо, у которого есть текст, который можно получить с помощью метода `getMessage`
*/
    public static class MailMessage extends AbstractSendable {

        private final String message;

        public MailMessage(String from, String to, String message) {
            super(from, to);
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;

            MailMessage that = (MailMessage) o;

            if (message != null ? !message.equals(that.message) : that.message != null) return false;

            return true;
        }

    }

    /*
Посылка, содержимое которой можно получить с помощью метода `getContent`
*/
    public static class MailPackage extends AbstractSendable {
        private final Package content;

        public MailPackage(String from, String to, Package content) {
            super(from, to);
            this.content = content;
        }

        public Package getContent() {
            return content;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;

            MailPackage that = (MailPackage) o;

            if (!content.equals(that.content)) return false;

            return true;
        }

    }

    /*
Класс, который задает посылку. У посылки есть текстовое описание содержимого и целочисленная ценность.
*/
    public static class Package {
        private final String content;
        private final int price;

        public Package(String content, int price) {
            this.content = content;
            this.price = price;
        }

        public String getContent() {
            return content;
        }

        public int getPrice() {
            return price;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Package aPackage = (Package) o;

            if (price != aPackage.price) return false;
            if (!content.equals(aPackage.content)) return false;

            return true;
        }
    }

    /*
Интерфейс, который задает класс, который может каким-либо образом обработать почтовый объект.
*/
    public static interface MailService {
        Sendable processMail(Sendable mail);
    }

    /*
    Класс, в котором скрыта логика настоящей почты
    */
    public static class RealMailService implements MailService {


        @Override
        public Sendable processMail(Sendable mail) {
            return null;
        }
    }

    public static final String AUSTIN_POWERS = "Austin Powers";
    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";

    public static class UntrustworthyMailWorker implements MailService {
        private final RealMailService realMailService = new RealMailService();
        private MailService[] mailServices;

        public UntrustworthyMailWorker(MailService[] mailService) {
            this.mailServices = mailService;
        }

        public RealMailService getRealMailService() {
            return realMailService;
        }

        @Override
        public Sendable processMail(Sendable mail) {
            Sendable res = mail;
            for (int i = 0; i < mailServices.length; i++) {
                res = mailServices[i].processMail(res);
            }
            return realMailService.processMail(res);
        }
    }

    public static class Spy implements MailService {
        static Logger logger;
        RealMailService realMailService;

        public Spy(Logger logger) {
            this.logger = logger;
        }

        public RealMailService getRealMailService() {
            return realMailService;
        }

        @Override
        public Sendable processMail(Sendable mail) {
            if (mail.getClass() == MailMessage.class) {
                MailMessage mailMessage = (MailMessage) mail;
                String from = mailMessage.getFrom();
                String to = mailMessage.getTo();
                if (from.equals(AUSTIN_POWERS) || to.equals(AUSTIN_POWERS)) {
                    logger.warning("Detected target mail correspondence: from " + from + " to " + to + " \"" + mailMessage.getMessage() + "\"");
                } else {
                    logger.info("Usual correspondence: from " + from + " to " + to + "");
                }
            }
            return mail;
        }
    }

    public static class Thief implements MailService {
        private int minShipCost = 0;
        private int stolenValue = 0;

        public Thief(int minShipCost) {
            this.minShipCost = minShipCost;
        }

        public int getStolenValue() {
            return stolenValue;
        }

        @Override
        public Sendable processMail(Sendable mail) {
            if (mail.getClass() == MailPackage.class) {
                Package pack = ((MailPackage) mail).getContent();
                if (pack.getPrice() >= minShipCost) {
                    stolenValue += pack.getPrice();
                    mail = new MailPackage(mail.getFrom(), mail.getTo(),
                            new Package("stones instead of " + pack.getContent(), 0));
                }
            }
            return mail;
        }
    }

    public static class IllegalPackageException extends RuntimeException {
    }

    public static class StolenPackageException extends RuntimeException {
    }

    public static class Inspector implements MailService {
        @Override
        public Sendable processMail(Sendable mail) throws RuntimeException {
            if (mail.getClass() == MailPackage.class) {
                Package pack = ((MailPackage) mail).getContent();
                String content = pack.getContent();
                if (content.contains("stones")) {
                    throw new StolenPackageException();
                }
                if (content.contains(WEAPONS) || content.contains(BANNED_SUBSTANCE)) {
                    throw new IllegalPackageException();
                }
            }
            return mail;
        }
    }
}
