package Main;


public   class LandbaseradeFordon extends SuperClass {
    public int km;


    public LandbaseradeFordon(int weight, int price, Person owner, int km) {
        super(weight, price, owner);
        this.km = km;
    }

    public LandbaseradeFordon(int km) {
        this.km = km;
    }

    public int getKm() {
        return km;
    }

    public int drive(){
        return km++;
    }

}
