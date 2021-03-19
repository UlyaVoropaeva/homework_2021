package lesson_7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public int setFood(int pul) {
        food += pul;
        return food;
    }

    public void decreaseFood(int n) {
        if (contentsPlate(n))
            food -= n;
    }

    public boolean contentsPlate(int n) {

        return food - n >= 0;
    }


    public void info() {
        System.out.printf("Количество еды в тарелке %s%n ", food);
    }
}


