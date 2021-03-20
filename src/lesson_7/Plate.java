package lesson_7;

public class Plate {
    private int food;
    private  int maxFood = 100;

    public Plate(int food) {

        this.food = food;
    }

    public int getFood() {

        return food;
    }

    public int addFood(int pul) {
        if(maxFoodPlate(pul)){
            food += pul;
        }
            return food;
    }
    public  boolean maxFoodPlate(int pul){
        return pul <= maxFood;
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


