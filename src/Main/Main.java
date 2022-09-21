package Main;

 public class Main {

    public static void main(String[] args) {


        Airplane airplane = new Airplane(100);
        Helicopter helicopter = new Helicopter(100);
        Car car = new Car(500);
        MotorCycle motorcycle = new MotorCycle(100);
        Boat boat = new Boat(100);


        System.out.println(airplane.getHeight());
        System.out.println(helicopter.getHeight());
        System.out.println("This is km in car: " + car.getKm());
        System.out.println("This is km in motorcycle: " + motorcycle.getKm());
        System.out.println("This is gps in boat: " + boat.getGPS());

        car.line();
        car.drive();
        motorcycle.drive();
        System.out.println("Km is going up when you call metod drive " + car.getKm());
        System.out.println("Km is going up when you call metod drive " + motorcycle.getKm());

        boat.line();
        boat.Go();
        System.out.println("GPS get random position when you call metod Go() " + boat.getGPS());

        airplane.line();
        airplane.fly();
        System.out.println("Airplane owner " + airplane.getOwner());
        System.out.println(airplane.getHeight());
        airplane.fly(true);

        helicopter.line();
        helicopter.fly();
        System.out.println(helicopter.getHeight());
        helicopter.fly(true);


        Buyer VanjaBuyer = new Buyer("Vanja ", 25,"Buyer", 1000);
        Buyer robertBuyer = new Buyer("Robert", 23,"buyer", 1000);
        Selling selling = new Selling("selling", 30, "Seller",1000);
        Selling Alma = new Selling("Alma", 35,"seller", 1000);

        Dealer dealer = new Dealer("RobertDealer", 35, "Dealer", 1000);

        LandbaseradeFordon bmw = new LandbaseradeFordon(200,1000,"Alma",1000);

        selling.line();
        selling.selling(bmw,Alma,robertBuyer,dealer);

        Car audi = new Car(200,1000,"Alma",1000);
        audi.line();
        Alma.selling(audi,Alma,VanjaBuyer,dealer);



    }
}
/*
Uppgift 1
En kund behöver ett program för att ta hand om olika fordon. Fordonen som avses är bil, båt,
flygplan, helikopter och motorcykel.
Gör en klass för var och en av dessa och skapa superklasser för gemensamma variabler och metoder.
● Alla fordon ska ha en vikt och ett pris.
● Alla landbaserade fordon (bil och motorcykel) ska ha en km-räknare som ökar när man kör.
Man kör m.h.a. metoden drive(int kms)
● Alla vattenbaserade (båt) ska ha en GPS-position som slumpvis ändras
när man åker med båten.
 Man åker m.h.a. metoden go()
 ● Alla flygande ska ha en höjd som ökar när man flyger (flygplan, helikopter).
 Man flyger m.h.a. metoden fly(boolean isFlying).
 Om man skickar in false, betyder det att man vill landa.

 De klasser som är längst ner i trädet (dvs de olika fordon som beskrevs)
 behöver inte ha något eget,
 utan ska bara vara subklasser till lämpliga klasser för gemensamma saker.

Uppgift 2 Gör tre klasser: köpare, säljare, fordonshandlare.
Varje klass ska ha namn, ålder, jobb och pengar på banken. Hur ska man bäst göra detta?

Uppgift 3 Gör nu så att varje fordon kan ha en ägare.

Uppgift 4 Gör metoder till fordonshandlaren så ett fordon kan byta ägare.
Ett fordon ska inte bara byta ägare, utan säljaren ska få pengar av köparen och fordonshandlaren ska få sin andel. Säljaren ska bara kunna bli av med ett fordon och en köpare ska bara kunna få ett.

Uppgift 5 Skapa upp 3 köpare och 2 säljare och 1 fordonshandlare.
Skapa upp ett flygplan, en helikopter och en bil.
1 säljare ska äga flygplanet och helikoptern medan bilen ska ägas
av den andre. Låt nu köparna köpa varsitt fordon. Skriv ut transaktionerna
på skärmen
7 Generics
1 Skriv en generisk klass med namnet Safe, som representerar ett kassaskåp. Klassen ska ha metoderna store och retrieve. Store ska kunna lägga till ett objekt i kassaskåpet. Retrieve ska ta bort och returnera ett objekt som tidigare lagras i kassaskåpet.

2 Skapa ett program som lägger till 10 slumptal av datatypen double i en lista. Loopa igenom listan med foreach och skriv ut värdet på slumptalen.

3 Skapa ett “Dictionary-objekt”, (Map + HashMap i modern Java) som har en string som key och Animal-objekt som value. Använd klasserna från övning 6.4. Skapa fem olika Animal-objekt och lägg till dem till din Map med ett lämpligt nyckelvärde. Testa att det går att plocka fram objekten igen.

4 Skapa en generisk klass med namnet Trio. Den ska ha tre publika värden som man kan sätta till samma datatyp när man skapar objekt av klassen.

5 Ändra klassen Trio så att det kan vara tre olika datatyper, som är subklasser till olika fordonsklasser.


 */