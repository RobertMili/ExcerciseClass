package Main;

public class Selling extends Dealer {
    public Selling(String name, int age, String jobb, int moneyBank) {
        super(name, age, jobb, moneyBank);
    }

    @Override
    public void line() {
        super.line();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String getJobb() {
        return super.getJobb();
    }

    @Override
    public int getMoneyBank() {
        return super.getMoneyBank();
    }

    @Override
    public String toString() {
        return "Selling      {" +
                "age=" + age +
                ", jobb='" + jobb + '\'' +
                ", moneyBank=" + moneyBank +
                '}';
    }

    @Override
    public void selling(SuperClass vehicle, Selling selling, Buyer buyer, Dealer dealer) {
        super.selling(vehicle, selling, buyer, dealer);
    }
}
