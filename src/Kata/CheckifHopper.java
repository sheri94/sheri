package Kata;

public class CheckifHopper implements CheckTrain{


    @Override
    public boolean test(Animal a) {
        return a.canHop();
    }
}
