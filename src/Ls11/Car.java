package Ls11;

import p1.p2.p3.C;

public class Car {
    String name;
    String color;
    String dvigli;
    int qtyDoors;
    Car(String color,String dvigli, int qtyDoors, String name){
        this.color = color;
        this.dvigli = dvigli;
        this.qtyDoors = qtyDoors;
        this.name = name;
    }
}

class CarTest {
    public static int changeQtyDoors(Car nowDoors, int willDoors) {
        System.out.println("Колличество дверей у автомобиля измененно с "+ nowDoors.qtyDoors+ " на "+ willDoors);
        return nowDoors.qtyDoors = willDoors;
    }

    public static void swapColor(Car c1, Car c2) {
        String c3 = c1.color;
        c1.color = c2.color;
        c2.color = c3;
        System.out.println("Для автомобиля "+ c1.name + " изменен цвет на "+ c1.color);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Red", "V6", 3, "Toyota");
        Car car2 = new Car("Black","V8", 5,"Mazda");
        changeQtyDoors(car1,4);
        System.out.println(car1.qtyDoors);
        System.out.println();
        System.out.println(car1.color);
        System.out.println(car2.color);
        swapColor(car1,car2);
        System.out.println(car1.color);
        System.out.println(car2.color);

    }
}
