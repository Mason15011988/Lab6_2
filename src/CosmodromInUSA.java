import ObjectsForStart.IStart;

public class CosmodromInUSA implements ICosmodrom {
    private IStart start;

    public CosmodromInUSA(IStart start) {
        this.start = start;
    }
    public CosmodromInUSA(){}

    public IStart getStart() {
        return start;
    }

    public void setStart(IStart start) {
        this.start = start;
    }

    @Override
    public void pusk() {
        System.out.println("Запуск с космодрома в США");
        start.name();
        if( start.prePusk()){
            System.out.println("Предстартовая проверка прошла успешно");
            start.pusk();
            System.out.println("Обратный отсчет:");
            for (int i = 5; i > 0; i-- ){
                System.out.println(i);
            }
            System.out.println("Помогите");
            start.start();
        }else {
            System.out.println("Предстартовая проверка провалилась");
        }

    }
}
