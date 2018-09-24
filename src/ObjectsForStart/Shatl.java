package ObjectsForStart;

import java.util.Random;

public class Shatl implements IStart {
    Random random = new Random();

    @Override
    public void name() {
        System.out.println("Начинаем запуск Shatl");
    }

    @Override
    public boolean prePusk() {
        if (random.nextInt(11) > 3){
            return true;
        }
            return false;
    }

    @Override
    public void pusk() {
        System.out.println("Двигатели Shatl запущены");
    }

    @Override
    public void start() {
        System.out.println("Старт Shatl");
    }
}
