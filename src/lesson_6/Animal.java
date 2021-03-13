package lesson_6;

public abstract class Animal {
    final private String name;

    static int count;

    Animal(String name) {
        this.name = name;

        count++;
    }

    public String getName() {
        return name;
    }


    public abstract void run(int length);

    public abstract void swim(int length);
}
