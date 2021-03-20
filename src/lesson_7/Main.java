package lesson_7;

import java.util.Scanner;

/**
 * 1. Расширить задачу про котов и тарелки с едой.
 * 2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
 * (например, в миске 10 еды, а кот пытается покушать 15-20).
 * 3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
 * Если коту удалось покушать (хватило еды), сытость = true.
 * 4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает,
 * то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
 * 5. Создать массив котов и тарелку с едой, попросить всех котов покушать
 * из этой тарелки и потом вывести информацию о сытости котов в консоль.
 * 6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal[] animals = {
                new Cat("Cat Zifir"),
                new Dog("Dog Bobik"),
                new Cat("Cat Simon"),
                new Dog("Dog Sharik"),
                new Cat("Cat Murzik"),
                new Cat("Cat Iris"),
        };
        Plate plate = new Plate(0);

        System.out.println("Пожалуйста, покормите домашних питомцев:");
         int us = scanner.nextInt();
        plate.addFood(us);
        while (plate.getFood()==0){
            System.out.println("Тарелка не в мешает введенное количество еды. Наполните снова:");
            us = scanner.nextInt();
            plate.addFood(us);
        }

        plate.info();

        for (int i = 0; i < animals.length; i++) {

            while (true) {
                if (animals[i].isSatiety(plate)) {
                    animals[i].eat(plate);
                    plate.info();
                    break;
                } else {
                    System.out.printf("%s до полной сытоти не хватает %s еды %n Добавьте еды в тарелку %n", animals[i].getName(), (animals[i].getAppetite() - plate.getFood()));
                    us = scanner.nextInt();
                    plate.addFood(us);
                }
            }
        }
            for (int i = 0; i < animals.length; i++) {

                while (true) {
                    if (animals[i].isSatiety(plate)) {
                        animals[i].eat(plate);
                        plate.info();
                        break;
                    } else {
                        System.out.printf("%s до полной сытоти не хватает %s еды %n Добавьте еды в тарелку %n", animals[i].getName(), (animals[i].getAppetite() - plate.getFood()));
                        us = scanner.nextInt();
                        plate.addFood(us);
                    }
                }
            }

        }

}
