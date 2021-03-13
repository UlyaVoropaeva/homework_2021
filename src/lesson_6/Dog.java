package lesson_6;

public class Dog extends Animal {

    final int lengthRun =500;
    final int lengthSwim =10;
    static int count;


    Dog(String name ) {
        super(name);

        count++;
    }

    @Override
    public void run(int length) {
        if (length <= lengthRun) {
            System.out.printf("Собака %s  пробежала  %s метров %n", getName(), length);
        } else
            System.out.printf("Собака %s  пробежала только %s  из %s метров. Больше не смогла... упала. %n", getName(), lengthRun, length);
    }

    @Override
    public void swim(int length) {
        if (length <= lengthSwim) {
            System.out.printf("Собака %s  проплыла  %s метров %n", getName(), length);
        } else
            System.out.printf("Собака %s  проплыла только %s из %s метров. Больше не смогла... утонула((( %n", getName(), lengthSwim, length);
    }


}
