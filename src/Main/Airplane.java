package Main;

import Main.Flyganede;

public class Airplane extends Flyganede {

    @Override
    public void line() {
        super.line();
    }

    public Airplane(int height) {
        super(height);
    }

    @Override
    public int fly() {
        return super.fly();
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
        return super.getHeight() ;
    }
    public void printOutHeight(){
        System.out.print("Height for airplane it is: : ");
    }

    public void printOutisFlying(){
        System.out.print("Airplane is ");
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
