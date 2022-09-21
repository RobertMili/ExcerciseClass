package Main;

public class Buyer extends Person {


    public Buyer(String name, int age, String jobb, int moneyBank) {
        super(name, age, jobb, moneyBank);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void line() {
        super.line();
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
        return "Buyer        {" +
                "age=" + age +
                ", jobb='" + jobb + '\'' +
                ", moneyBank=" + moneyBank +
                '}';
    }
}
