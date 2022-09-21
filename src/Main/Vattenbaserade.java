package Main;

import Main.SuperClass;

import java.util.Random;

public class Vattenbaserade extends SuperClass {
    public int GPS;

    public Vattenbaserade(int GPS) {
        this.GPS = GPS;
    }

    public int Go(){
        Random number = new Random();
        GPS = number.nextInt(100);
        return GPS;
    }

    public int getGPS() {
        return GPS;
    }
}
