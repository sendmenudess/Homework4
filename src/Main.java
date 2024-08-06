import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1(){
        System.out.println("Задача 1");
        int howOldIs = 17;
        if (howOldIs >= 18)
            System.out.printf("Если возраст человека равен %d , то он совершеннолетний \n", howOldIs);
        else
            System.out.printf("Если возраст человека равен %d , то он не достиг совершеннолетия, нужно немного подождать \n", howOldIs);
    }
    public static void task2(){
        System.out.println("Задача 2");
        float temperature = 4.5f;
        if (temperature < 5)
            System.out.printf("На улице %f градусов, нужно надеть шапку\n", temperature);
        else
            System.out.printf("На улице %f градусов, можно идти без шапки\n", temperature);
    }
    public static void task3(){
        System.out.println("Задача 3");
        int speed = 60;
        if (speed >= 60)
            System.out.printf("Если скорость %d, то придется заплатить штраф\n", speed);
        else
            System.out.printf("Если скорость %d, то можно ездить спокойно\n", speed);

    }
    public static void task4(){
        System.out.println("Задача 4");
        //Взял на себя смелость реализовать через ввод данных, извините, если что - исправлю
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if (age >= 2 && age < 7)
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в детский сад\n", age);
        else if (age >= 7 && age <18)
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в школу\n", age);
        else if (age >= 18 && age <24)
            System.out.printf("Если возраст человека равен %d, то его место в университете\n", age);
        else if (age >=24)
            System.out.printf("Если возраст человека равен %d, то ему пора ходить на работу\n", age);
    }
    public static void task5(){
        System.out.println("Задача 5");
        int kidAge = 29;
        if (kidAge < 5)
            System.out.printf("Если возраст ребенка равен %d, то ему нельзя кататься на аттракционе\n", kidAge);
        else if (kidAge >= 5 && kidAge <14)
            System.out.printf("Если возраст человека равен %d, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя\n", kidAge);
        else
            System.out.printf("Если возраст человека равен %d, то он может кататься без сопровождения взрослого\n", kidAge);
    }
    public static void task6(){
        System.out.println("Задача 6");
        int totalPlaces = 102;
        int seatingPlaces = 60;
        int passengers = 59;
        if (passengers < 60)
            System.out.println("В вагоне есть и сидячие, и стоячие места");
        else if (passengers >= 60 && passengers < 102)
            System.out.println("В вагоне есть стоячие места");
        else
        System.out.println("В вагоне нет свободных мест");
    }
    public static void task7(){
        System.out.println("Задача 7");
        int one =9;
        int two = 12;
        int three= 7;
        if (one > two && one > three)
            System.out.printf("Максимальное число %d", one);
        else if (two > one && two > three)
            System.out.printf("Максимальное число %d", two);
        else
            System.out.printf("Максимальное число %d", three);
    }


}