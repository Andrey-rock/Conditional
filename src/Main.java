public class Main {
    public static void main(String[] args) {
        //Задание 1
        int age = 30;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age +
                    ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        //Задание 2
        int temperature = 4;
        if (temperature < 5) {
            System.out.println("На улице  " + temperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице  " + temperature + " градусов, можно идти без шапки.");
        }

        //Задание 3
        int speed = 150;
        if (speed > 60) {
            System.out.println("Если скорость  " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость  " + speed + ", то мщжно ездить спокойно");
        }

        //Задание 4
        int age2 = 29;
        if (age2 >= 2 && age2 <= 6) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад.");
        } else if (age2 >= 7 && age2 <= 17){
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу.");
        } else if (age2 >= 18 && age2 <= 24){
            System.out.println("Если возраст человека равен " + age2 + ", то его место в университете.");
        } else if (age2 > 24){
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить на работу.");
        }

        //Задание 5
        int age3 = 17;
        if (age3 < 5) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему нельзя кататься на аттракционе.");
        } else if (age3 >= 5 && age3 < 14) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else if (age3 >= 14) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }

        //Задание 6
        int capacity = 102;
        int seats = 60;
        int countPassengers = 102;
        if (countPassengers < seats) {
            System.out.println("Есть сидячие места");
        } else if (countPassengers >= seats && countPassengers < capacity) {
            System.out.println("Есть стоячие места");
        } else if (countPassengers >= capacity) {
            System.out.println("Мест нет");
        }

        //Задание 7
        int one = -10;
        int two = 20;
        int three = -33;
        if (one > two && one > three) {
            System.out.println("Наибольшее число " + one);
        }
        else if (two > one && two > three) {
            System.out.println("Наибольшее число " + two);
        }
        else if (three > one && three > two) {
            System.out.println("Наибольшее число " + three);
        }
    }
}