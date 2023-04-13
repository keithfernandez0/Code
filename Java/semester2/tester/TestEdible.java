package semester2.tester;

public class TestEdible {
    abstract class Animal {
        private double weight;

        public double getWeight() {
            return weight;
        }

        public abstract String sound();
    }
    

    class Chicken extends Animal implements Edible {
        @Override
        public String howToEat() {
            return "Chicken: Fry it";
        }

        @Override

    }
}