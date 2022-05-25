package Kata;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Lambda {
    public static void main(String[] args) {


        List<Animal> animals = new ArrayList<>();

        animals.add(new Animal("Rabbit", true, false));
        animals.add(new Animal("Fish", false, true));
        animals.add(new Animal("White Bear", true, true));
        animals.add(new Animal("Cat", true, false));

        print(animals,  e -> e.canHop());

    }
    private static void print(List<Animal> animals, CheckTrain checker){
        for(Animal animal: animals){
            if(checker.test(animal)){
                System.out.println(animal + " ");
            }
        }

        System.out.println();
    }
}