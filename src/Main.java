public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Поздравление пользователя с совершеннолетием");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия еще не наступил. Необходимо немного подождать");
        }

        System.out.println("Задача 2");
        int personAge = 17;
        if (personAge >= 7 && personAge < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (personAge >= 18 && personAge < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (personAge >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        System.out.println("Задача 3");
        int totalSeats = 102;
        int seatCount = 60;
        int standingCount = totalSeats - seatCount;

        int seatsUsed = 60;
        int standingUsed = 42;

        if (standingUsed < standingCount) {
            System.out.println("В вагоне есть " + (standingCount - standingUsed) + " стоячих мест");
        }
        if (seatsUsed < seatCount) {
            System.out.println("В вагоне есть " + (seatCount - seatsUsed) + " сидячие места");
        }
        if (standingUsed >= standingCount && seatsUsed >= seatCount) {
            System.out.println("Вагон уже полностью забит");
        }



    }

}

