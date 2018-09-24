package ObjectsForStart;

import java.util.Scanner;

public class SpaceX implements IStart {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void name() {
        System.out.println("Начинаем запуск  SpaceX");
    }

    @Override
    public boolean prePusk() {
        System.out.println("Введите секретный код");
        if (scanner.nextInt()== 556){
            return true;
        }
        return false;
    }

    @Override
    public void pusk() {
        System.out.println("Двигатели SpaceX запущены");
    }

    @Override
    public void start() {
        System.out.println("Старт  SpaceX");
    }
}
