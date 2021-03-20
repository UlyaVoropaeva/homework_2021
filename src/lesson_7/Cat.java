package lesson_7;

public class Cat extends Animal {
    public Cat(String name) {
        super(name, 200, 0, 20);
    }

    @Override
    public void swim(int distance) {
        System.out.printf("%s боится воды и купаться он точно не пойдет.%n", getName());
    }


}
