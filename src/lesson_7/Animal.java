package lesson_7;

public abstract class Animal {

    private final String name;
    private final int maxRunDistance;
    private final int maxSwimDistance;
    private int appetite;
    private boolean satiety;


    public Animal(String name, int maxRunDistance, int maxSwimDistance,
                  int appetite) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.appetite = appetite;
        satiety = false;
    }

    public String getName() {

        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat(Plate p) {

        p.decreaseFood(appetite);
        satiety = true;

        String message = satiety == true ? "%s сыт %n" : "%s  голеден и  просит добавки %n ";
        System.out.printf(message, getName());
        satiety = false;
    }

    public boolean isSatiety(Plate p) {

        return p.contentsPlate(appetite);
    }

    public void run(int distance) {

        boolean isFeasible = distance <= maxRunDistance;

        String message = isFeasible == true ? "%s  пробежал  %s метров %n" : "%s  пробежал только %s метров. Больше не смог... упал. %n";
        System.out.printf(message, name, distance);
    }

    public void swim(int distance) {
        boolean isFeasible = distance <= maxRunDistance;

        String message = isFeasible == true ? "%s проплыла  %s метров %n" : "%s отказалась плыть дистанцию в %s метров %n";
        System.out.printf(message, name, distance);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", maxRunDistance=" + maxRunDistance +
                ", maxSwimDistance=" + maxSwimDistance +
                '}';
    }

}
