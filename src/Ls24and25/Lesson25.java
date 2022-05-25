package Ls24and25;

public class Lesson25 {
    public static void main(String[] args) {
        /*Mechenosec mechenosec = new Mechenosec("Dima");
        System.out.println(mechenosec.name);
        mechenosec.eat();
        mechenosec.swim();
        mechenosec.sleep();
        System.out.println("-------------------");
        Speakable pingvin = new Pingvin("Tola");
        pingvin.speak();
        System.out.println("-------------------");
        Animal levAnimal = new Lev("Reincarnated Dima");
        System.out.println(levAnimal.name);
        levAnimal.eat();
        levAnimal.sleep();
        System.out.println("-------------------");
        Mammal lev = new Lev("Andrey");
        System.out.println(lev.name);
        lev.run();
        lev.speak();
        lev.eat();
        lev.sleep();*/
        //Задине к лекции 24
        /////////////////////////////////////////////////////////////////////
        Animal a1 = new Mechenosec("Дима ");
        Animal a2 = new Pingvin("Толя ");
        Animal a3 = new Lev("Андрей");
        Fish f1 = new Mechenosec("Дима2");
        Bird b1 = new Pingvin("Толя2");
        Mammal m1 = new Lev("Андрей2");
        Mechenosec mc1 = new Mechenosec("Дима3");
        Pingvin p1 = new Pingvin("Толя3");
        Lev l1 = new Lev("Андрей3");
        Speakable sp1 = new Pingvin("Толя4");
        Speakable sp2 = new Lev("Андрей4");



        Speakable[] arreySpeak = {b1,m1,p1,l1,sp1,sp2};
        Animal[] arrayAnimal = {a1,a2,a3,f1,b1,m1,mc1,p1,l1};

        for( Animal a :arrayAnimal){
            if (a instanceof Mechenosec){
                Mechenosec m = (Mechenosec)a;
                System.out.println(a.name);
                m.eat();
                m.sleep();
                m.swim();
            }else if (a instanceof Pingvin){
                Pingvin p = (Pingvin) a;
                System.out.println(p.name);
                p.eat();
                p.sleep();
                p.fly();
                p.speak();
            }else if(a instanceof Lev){
                Lev l = (Lev) a;
                System.out.println(l.name);
                l.eat();
                l.run();
                l.sleep();
                l.speak();
            }
        }
        System.out.println("-----------------------------------------------");

        for (Speakable s:arreySpeak){
            if (s instanceof Mechenosec){
                Mechenosec m = (Mechenosec) s;
                System.out.println(m.name);
                m.swim();
                m.eat();
                m.sleep();
            }else if(s instanceof Pingvin){
                Pingvin p = (Pingvin) s;
                System.out.println(p.name);
                p.speak();
                p.fly();
                p.eat();
                p.sleep();
            }else if (s instanceof Lev){
                Lev l = (Lev) s;
                System.out.println(l.name);
                l.speak();
                l.run();
                l.sleep();
                l.eat();
            }
        }

    }

}

abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void eat();

    abstract void sleep();
}

abstract class Fish extends Animal {
    Fish(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void sleep() {
        System.out.println("Всегда интерсно как спят рыбы");
    }

    abstract void swim();
}

abstract class Bird extends Animal implements Speakable {
    Bird(String name) {
        super(name);
        this.name = name;
    }

    abstract void fly();

    @Override
    public void speak() {
        System.out.println(name + " speaks");
    }
}

abstract class Mammal extends Animal implements Speakable {
    Mammal(String name) {
        super(name);
        this.name = name;
    }

    abstract void run();

    @Override
    public void speak() {
        System.out.println(name + " speaks");
    }
}


interface Speakable {
    default void speak() {
        System.out.println("Somebody speaks");
    }

}

class Mechenosec extends Fish {
    Mechenosec(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void swim() {
        System.out.println("Меченосец красива рыба, которая быстро плавает");
    }

    @Override
    void eat() {
        System.out.println("Меченосец не хищная рыба, и она ест обычный рыбий корм");
    }
}

class Pingvin extends Bird {
    Pingvin(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("Пингвин любит есть рыбу");
    }

    @Override
    void sleep() {
        System.out.println("Пингвины спят прижавшись друг к другу");
    }

    @Override
    public void speak() {
        System.out.println("Пингвинны не у веют петь как соловьи");
    }

    @Override
    void fly() {
        System.out.println("Пингвинны не умеют летать");
    }
}

class Lev extends Mammal {
    Lev(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("Лев, как любой хищник любит мясо");
    }

    @Override
    void sleep() {
        System.out.println("Большую часть дня лев спит");
    }

    @Override
    void run() {
        System.out.println("Лев это не самая быстрая кошка");
    }
}