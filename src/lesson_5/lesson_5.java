package lesson_5;

public class lesson_5 {
    public static void main(String[] args){
        Person[] persArray = new Person[5];
        persArray[0] = new Person ("Ivanov Ivan", "Director",
                "IIvanov@person.com", 7550525, 352145, 35 );
        persArray[1] = new Person ("Petrov Petr", "Accountant",
                "PPetrov@person.com", 7668525, 200000, 55 );
        persArray[2] = new Person ("Lubov Ivanova", "Secretary",
                "LIvanova@person.com", 5555555, 450568, 25 );
        persArray[3] = new Person ("Vadim Ige", "Specialists",
                "special@person.com", 1234585 , 50000, 49 );
        persArray[4] = new Person ("Nikita Simanov", "Director",
                "special@person.com", 2192585, 45000, 50 );


        for (int i = 0; i< persArray.length; i++ ) {
            persArray[i].printSelection();
        }

    }
}
