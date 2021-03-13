package lesson_6;

public class Cat extends Animal {
    final int lengthRun = 200;
    final int lengthSwim = 0;
    static int count;

    Cat(String name) {
        super(name);

        count++;
    }


    @Override
    public void run(int length) {
        if (length <= lengthRun) {
            System.out.printf("Кот %s  пробежал  %s метров %n", getName(), length);
        } else
            System.out.printf("Кот %s  пробежал только %s метров из %s. Больше не смог... упал. %n", getName(), lengthRun, length);
    }

    @Override
    public void swim(int length) {
        System.out.printf("Кот %s боится воды и купаться он точно не пойдет.%n", getName());
    }


}
