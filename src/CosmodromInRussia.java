import ObjectsForStart.IStart;

public class CosmodromInRussia implements ICosmodrom {
    private IStart start;

    public CosmodromInRussia(IStart start) {
        this.start = start;
    }
    public CosmodromInRussia(){}

    public IStart getStart() {
        return start;
    }

    public void setStart(IStart start) {
        this.start = start;
    }

    @Override
    public void pusk() {
        System.out.println("Запуск с космодрома в России");
        start.name();
        if( start.prePusk()){
            System.out.println("Предстартовая проверка прошла успешно");
            start.pusk();
            System.out.println("Обратный отсчет:");
            for (int i = 10; i > 0; i-- ){
                System.out.println(i);
            }
            start.start();
        }else {
            System.out.println("Предстартовая проверка провалилась");
        }
    }

}
