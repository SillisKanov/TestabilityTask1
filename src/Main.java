import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("Задание № 1");
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println("Должно получиться пятьсот, результат - " + miles);
    }
}

