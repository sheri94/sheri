package Ls22;

public class Cat extends Pet{
    Cat(String name){
        this.name = name;
        System.out.println("Я кот, и мое имя "+ name);
    }
    public static void sleep (){
        System.out.println("Кот спит!");
    }
}
