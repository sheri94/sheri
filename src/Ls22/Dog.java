package Ls22;

public class Dog extends Pet{
    Dog(String name){
        this.name = name;
        System.out.println("Я собака, и мое имя " + name);
    }
    public static void play(){
        System.out.println("Собака играет!");
    }

}
