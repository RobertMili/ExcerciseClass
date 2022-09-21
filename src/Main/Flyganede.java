package Main;

import Main.SuperClass;

public class Flyganede extends SuperClass {
    public int height;


    public Flyganede(int height) {
        this.height = height;
    }

    public int fly() {
        return height++;
    }

    public int getHeight() {
        return height;
    }

    public boolean fly(boolean isFlying) {
        if (isFlying == true) {
            System.out.println("flying");
            return true;
        } else {
            System.out.println("gonna land");
            return false;
        }

    }
}


