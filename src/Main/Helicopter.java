package Main;

import Main.Flyganede;

public class Helicopter extends Flyganede {

    @Override
    public void line() {
        super.line();
    }

    public Helicopter(int height) {
        super(height);
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
    public int getHeight() {
        printOutHeight();
        return super.getHeight();
    }
    public void printOutHeight(){
        System.out.print("Height for helicopter is: ");
    }

    public void printOutisFlying(){
        System.out.print("Helicopter is ");
    }
    @Override
    public boolean fly(boolean isFlying) {
        printOutisFlying();
        return super.fly(isFlying);
    }

    @Override
    public String getOwner() {
        return super.getOwner();
    }
}
