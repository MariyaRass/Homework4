public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int age = 15;
        if (age >= 18){
            System.out.println("Если возраст человека равен " + age +  " он совершеннолетний.");
        }
        if (age < 18){
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать.");
        }

        System.out.println("Задание 2");
        int temp = 2;
        if (temp < 5 ) {
            System.out.println("На улице " + temp + " градуса" +  " нужно надеть шапку.");
        }
        if (temp > 5) {
            System.out.println("На улице " + temp + " градусов" + " можно идти без шапки.");
        }
        System.out.println("Задание 3");
        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " придется заплатить штраф.");
        }
        if (speed < 60) {
            System.out.println("Если скорость " + speed + " можно ездить спокойно.");
        }

        System.out.println("Задание 4");
        int years = 38;
        if (years >=2 && years <=6) {
            System.out.println("Если человеку " + years + " то ему нужно ходить в детский сад.");
        }else if (years >=7 && years <=17) {
            System.out.println("Если человеку " + years + " то ему нужно ходить школу.");
        } else if (years >=18 && years <=24) {
            System.out.println("Если человеку " + years + " то ему нужно ходить университет.");
        } else if (years >24) {
            System.out.println("Если человеку " + years + " то ему нужно ходить на работу.");
        }
        System.out.println("Задание 5");
        int agePerson = 6;
        if (agePerson < 5){
            System.out.println("Если возраст ребенка равен  " + agePerson + " то он не может кататься на аттракционе.");
        } else if (agePerson > 5 && agePerson <14) {
            System.out.println("Если возраст ребенка равен  " + agePerson + " то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else if (agePerson > 14) {
            System.out.println("Если возраст ребенка равен  " + agePerson + " то он может кататься без сопровождения взрослого.");
        }
        System.out.println("Задание 6");
        int van = 122;
        int sitting = 60;
        if (van <= 60) {
            System.out.println(" В вагоне есть сидячие и стоячие места.");
        } else if (van >= 60 && van < 102) {
            System.out.println(" В вагоне есть только стоячие места.");
        } else if (van >102) {
            System.out.println(" В вагоне мест нет.");
        }
        System.out.println("Задание 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one>two && one>three) {
            System.out.println("Самое большое число- " + one);
        } else if (two>one && two>three) {
            System.out.println("Самое большое число- " + two);
        } else if (three>one && three>two) {
            System.out.println("Самое большое число- " + three);

        }

    }

    }
























