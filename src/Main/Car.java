package Main;

public class Car extends LandbaseradeFordon {

    public Car(int weight, int price, Person owner, int km) {
        super(weight, price, owner, km);
    }

    public Car(int km) {
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
    public Person getOwner() {
        return super.getOwner();
    }

    @Override
    public void setWeight(int weight) {
        super.setWeight(weight);
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }

    @Override
    public void setOwner(String name) {
        super.setOwner(name);
    }

    @Override
    public String toString() {
        return "SuperClass{" +
                "weight=" + getWeight() +
                ", price=" + getPrice() +
                ", owner='" + getOwner() +
                ", km='" + getKm() +'\'' +
                '}';
    }
}
