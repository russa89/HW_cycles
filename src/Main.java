public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++){
        System.out.println(i);
    }
        System.out.println("\nЗадача 2");
        for (int i = 10; i >= 1; i--){
            System.out.println(i);
        }
        System.out.println("\nЗадача 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("\nЗадача 4");
        for (int i = 10; i >= -10; i--){
            System.out.println(i);
        }
        System.out.println("\nЗадача 5");
        for (int i = 1904; i <= 2096; i = i + 4){
            System.out.println(i + " год является високосным");
        }
        System.out.println("\nЗадача 6");
        for (int i = 7; i <= 98; i = i + 7){
            System.out.println(i);
        }
        System.out.println("\nЗадача 7");
        for (int i = 1; i <= 512; i = i * 2){
            System.out.println(i);
        }
        System.out.println("\nЗадача 8");
        int money = 29000;
        int total = 0;
        for (int m = 1; m <= 12; m++){
            total = total + money;
            System.out.println("Месяц " + m + " - сумма накоплений равна " + total);
        }
        System.out.println("\nЗадача 9");
        int moneySaving = 29000;
        int totalSaving = 0;
        for (int m = 1; m <= 12; m++){
            totalSaving = totalSaving + moneySaving;
            totalSaving = totalSaving + totalSaving/100;
            System.out.println("Месяц " + m + " - сумма накоплений равна " + totalSaving);
    }
        System.out.println("\nЗадача 10");
        int number = 2;
        for (int n = 1; n <= 10; n++){
            System.out.println(number + "*" + n + "=" + number*n);
        }


}
}