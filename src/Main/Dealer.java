package Main;

public class Dealer extends Person {

    public Dealer(String name, int age, String jobb, int moneyBank) {
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
        return "VehicleDealer{" +
                "age=" + age +
                ", jobb='" + jobb + '\'' +
                ", moneyBank=" + moneyBank +
                '}';
    }

    public void selling(SuperClass vehicle, Selling selling, Buyer buyer, Dealer dealer){
        System.out.println("\nOwner of vehicle it is " + vehicle.getOwner());
        System.out.println("\nBuyer is: " + buyer.getName());
        System.out.println("\nVehicle is: " + vehicle.getClass());
        vehicle.setOwner(buyer.getName());

        transferCash(vehicle, selling,buyer,dealer);

        System.out.println("\nNew owner of " + vehicle + " is " + vehicle.getOwner());
        System.out.println("\nSelling  are " + selling.getName());
        System.out.println("\nBuyer is " + buyer.getName());
        System.out.println("\nBuyer have now $" + buyer.getMoneyBank());
        System.out.println("\nSeller have  $ " + selling.getMoneyBank());
        System.out.println("\nDealer have $ " + dealer.getMoneyBank());
    }

    private static void transferCash(SuperClass vehicle,Selling selling, Buyer buyer, Dealer dealer) {
        selling.setMoneyBank(selling.getMoneyBank() + vehicle.getPrice());
        buyer.setMoneyBank(vehicle.getPrice() - buyer.getMoneyBank());
        dealer.setMoneyBank(vehicle.getPrice() * 0.2);

    }
    // Och den här också Martin
    public void sellingCar(Car vehicle, Selling selling, Buyer buyer, Dealer dealer){
        System.out.println("\nOwner of vehicle it is " + vehicle.getOwner());
        System.out.println("\nBuyer is: " + buyer.getName());
        System.out.println("\nVehicle is: " + vehicle.getClass());
        vehicle.setOwner(buyer.getName());

        transferCash(vehicle, selling,buyer,dealer);

        System.out.println("\nNew owner of " + vehicle + " is " + vehicle.getOwner());
        System.out.println("\nSelling  are " + selling.getName());
        System.out.println("\nBuyer is " + buyer.getName());
        System.out.println("\nBuyer have now $" + buyer.getMoneyBank());
        System.out.println("\nSeller have  $ " + selling.getMoneyBank());
        System.out.println("\nDealer have $ " + dealer.getMoneyBank());
    }

    private static void transferCashCar(Car vehicle,Selling selling, Buyer buyer, Dealer dealer) {
        selling.setMoneyBank(selling.getMoneyBank() + vehicle.getPrice());
        buyer.setMoneyBank(vehicle.getPrice() - buyer.getMoneyBank());
        dealer.setMoneyBank(vehicle.getPrice() * 0.2);
    }
    // Och den här också Martin
    public void sellingCar(MotorCycle vehicle, Selling selling, Buyer buyer, Dealer dealer){
        System.out.println("\nOwner of vehicle it is " + vehicle.getOwner());
        System.out.println("\nBuyer is: " + buyer.getName());
        System.out.println("\nVehicle is: " + vehicle.getClass());
        vehicle.setOwner(buyer.getName());

        transferCash(vehicle, selling,buyer,dealer);

        System.out.println("\nNew owner of " + vehicle + " is " + vehicle.getOwner());
        System.out.println("\nSelling  are " + selling.getName());
        System.out.println("\nBuyer is " + buyer.getName());
        System.out.println("\nBuyer have now $" + buyer.getMoneyBank());
        System.out.println("\nSeller have  $ " + selling.getMoneyBank());
        System.out.println("\nDealer have $ " + dealer.getMoneyBank());
    }

    private static void transferCashCar(MotorCycle vehicle,Selling selling, Buyer buyer, Dealer dealer) {
        selling.setMoneyBank(selling.getMoneyBank() + vehicle.getPrice());
        buyer.setMoneyBank(vehicle.getPrice() - buyer.getMoneyBank());
        dealer.setMoneyBank(vehicle.getPrice() * 0.2);
    }

}
