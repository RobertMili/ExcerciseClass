package Main;

public abstract class Person {
    public String name;
    public int age;
    public String jobb;
    public int moneyBank;

    public Person(String name, int age, String jobb, int moneyBank) {
        this.name = name;
        this.age = age;
        this.jobb = jobb;
        this.moneyBank = moneyBank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getJobb() {
        return jobb;
    }

    public int getMoneyBank() {
        return moneyBank;
    }
    public void line(){
        System.out.println("----------------------");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJobb(String jobb) {
        this.jobb = jobb;
    }

    public void setMoneyBank(double moneyBank) {
        this.moneyBank = (int) moneyBank;
    }
}
