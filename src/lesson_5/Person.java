package lesson_5;



/**1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
 2. Конструктор класса должен заполнять эти поля при создании объекта.
 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
 4. Создать массив из 5 сотрудников.
 Пример:
 Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
 persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
 persArray[1] = new Person(...);
 ...
 persArray[4] = new Person(...);

 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
 */
public class Person {
    private String fullName;
    private String post;
    private String email;
    private int phoneNumber;
    private int wages;
    private int age;


    public  Person (String fullName, String post, String email, int phoneNumber, int wages, int age){

        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.wages = wages;
        this.age = age;

    }
    public String getFullName(){
        return fullName;
    }
    public String getPost(){
        return post;
    }

    public String getEmail() {
        return email;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public int getWages() {
        return wages;
    }

    public void printPerson(){
        System.out.printf("fullName: %s, post [%s], email [%s], phoneNumber [%s], " +
                "wages [%s], age [%s] %n ",fullName, post, email, phoneNumber, wages, age);
    }
    public  void printSelection (){
        if (age > 40 ){
            printPerson();
        }
    }

}
