package lesson_6;

public class Main {
    public static void main(String[] args) {
        Cat catBarsik = new Cat("Barsik");
        Cat catSimon = new Cat("Simon");
        Cat catIris = new Cat("Iris");

        Dog dogBobik = new Dog("Bobik");
        Dog dogAlfa = new Dog("Alfa");


        catBarsik.run(100);
        catSimon.run(201);
        catIris.swim(5000);

        dogBobik.run(15000);
        dogAlfa.swim(15);

        System.out.println();
        System.out.println("Cat = " + Cat.count);
        System.out.println("Dog = " + Dog.count);
        System.out.println("Animal = " + Animal.count);


    }
}
