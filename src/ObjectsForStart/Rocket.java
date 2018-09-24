package ObjectsForStart;

import java.util.Random;
import java.util.Scanner;

public class Rocket implements IStart {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    @Override
    public void name() {
        System.out.println("Начинаем запуск Rocket");
    }

    @Override
    public boolean prePusk() {
        System.out.println("Введите число(0 или 1)");
        if (scanner.nextInt() == random.nextInt(2)) {
            return true;
        }
            return false;

    }

    @Override
    public void pusk() {
        System.out.println("Двигатели Rocket запущены");
    }

    @Override
    public void start() {
        System.out.println("Старт Rocket");
    }
}
