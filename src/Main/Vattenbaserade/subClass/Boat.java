package Main.Vattenbaserade.subClass;

import Main.Person;

public class Boat extends Vattenbaserade {


    @Override
    public void line() {
        super.line();
    }

    public Boat(int GPS) {
        super(GPS);
    }

    @Override
    public int getWeight() {
        return super.getWeight();
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public int getGPS() {
        return super.getGPS();
    }

    @Override
    public int Go() {
        return super.Go();
    }

    @Override
    public Person getOwner() {
        return super.getOwner();
    }
}
