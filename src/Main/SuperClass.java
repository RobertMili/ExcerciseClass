package Main;

import java.util.Objects;

public abstract class SuperClass {
         int weight;
        int price;
        Person owner;

        public SuperClass(int weight, int price, Person owner) {
                this.weight = weight;
                this.price = price;

        }

        public void setWeight(int weight) {
                this.weight = weight;
        }

        public void setPrice(int price) {
                this.price = price;
        }

        public void setOwner(String name) {
                this.owner = owner;
        }

        public SuperClass() {
        }

        public int getWeight() {
                return weight;
        }

        public int getPrice() {
                return price;
        }

        public Person getOwner() {
                return owner;
        }
        public void line(){
                System.out.println("--------------------------");
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                SuperClass that = (SuperClass) o;
                return weight == that.weight && price == that.price && Objects.equals(owner, that.owner);
        }

        @Override
        public int hashCode() {
                return Objects.hash(weight, price, owner);
        }

        @Override
        public String toString() {
                return "SuperClass{" +
                        "weight=" + weight +
                        ", price=" + price +
                        ", owner='" + owner + '\'' +
                        '}';
        }
}
