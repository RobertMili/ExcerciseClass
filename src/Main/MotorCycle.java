package Main;

import Main.LandbaseradeFordon;

public class MotorCycle extends LandbaseradeFordon {

    public MotorCycle(int weight, int price, String owner, int km) {
        super(weight, price, owner, km);
    }

    @Override
    public void line() {
        super.line();
    }

    public MotorCycle(int km) {
        super(km);
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
    public int getKm() {
        return super.getKm();
    }

    @Override
    public String getOwner() {
        return super.getOwner();
    }
}
