public class Main {
    public static void main(String[] args) {
        Shark shark = new Shark("akula", "blue", 3);
        Turtle turtle = new Turtle("ninje", "blue", 4);
        Eagle eagle = new Eagle("", "while", 2);
        Animal[] animals = {shark, turtle, eagle};
        for (Animal animal : animals) {
            if (animal instanceof Shark) {
                ((Shark) animal).attack();
            }
            if (animal instanceof Turtle) {
                ((Turtle) animal).swim();
            }
            if (animal instanceof Eagle) {
                ((Eagle) animal).fly();
            }
            System.out.println(animal);

            Shark[] sharks = new Shark[10];
            for (int i = 0; i < animals.length; i++) {
                if (animals[i] instanceof Shark) {
                    sharks[i] = (Shark) animals[i];
                    System.out.println(sharks[i]);
                }
            }
            Turtle[] turtles = new Turtle[10];
            for (int i = 0; i < animals.length; i++) {
                if (animals[i] instanceof Turtle) {
                    turtles[i] = (Turtle) animals[i];
                    System.out.println(turtles[i]);
                }
            }
            Eagle[] eagles = new Eagle[10];
            for (int i = 0; i < animals.length; i++) {
                if (animals[i] instanceof Eagle) {
                    eagles[i] = (Eagle) animals[i];
                    System.out.println(eagles[i]);
                }
            }


        }
    }
}