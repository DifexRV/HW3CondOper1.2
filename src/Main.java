public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int ageHum = 18;
        if (ageHum >= 2 && ageHum <= 6) {
            System.out.println("Если возраст человека равен " + ageHum + ", то ему нужно ходить в детский сад");}
        else if (ageHum >= 7 && ageHum <= 18) {
            System.out.println("Если возраст человека равен " + ageHum + ", то ему нужно ходить в школу");}
        else if (ageHum > 18 && ageHum <= 24) {
            System.out.println("Если возраст человека равен " + ageHum + ", то его место в университете");}
        else if (ageHum > 24) {
            System.out.println("Если возраст человека равен " + ageHum + ", то ему пора ходить на работу");}

        System.out.println("Задача 2");
        int ageKid = 15;
        if (ageKid < 5) {
            System.out.println("Ребенок не может кататься на аттракционе.");}
        else if (ageKid >= 5 && ageKid < 14) {
            System.out.println("Ребенок может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");}
        else if (ageKid >= 14) {
            System.out.println("Ребенок может кататься без сопровождения взрослого.");}

        System.out.println("Задача 3");
        int one = 13;
        int two = 17;
        int free = 33;
        if (one >= two && one >= free) {
            System.out.println("Большим числом является " + one); }
        else if (two >= one && two >= free) {
            System.out.println("Большим числом является " + two); }
        else if (free >= one && free >= two) {
            System.out.println("Большим числом является " + free); }



        }
    }
