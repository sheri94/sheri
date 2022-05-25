package Ls22;

public class Pet extends Animal{
    Pet(){
        System.out.println("Я домашний петомец!");
        eyes = 2;
    }

    public String name;
    public int tail = 1;
    public int paw = 4;
    public static void run(){
        System.out.println("Домашнее животное бежит!");
    }
    public static void jump(){
        System.out.println("Домашнее животное прыгает!");
    }
}
