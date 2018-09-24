import ObjectsForStart.Rocket;
import ObjectsForStart.Shatl;
import ObjectsForStart.SpaceX;

public class Run {
    public static void main(String[] args) {
        Shatl shatl = new Shatl();
        SpaceX spaceX = new SpaceX();
        Rocket rocket = new Rocket();

        CosmodromInRussia cosmodrom1 = new CosmodromInRussia(shatl);
        CosmodromInRussia cosmodrom2 = new CosmodromInRussia(spaceX);
        CosmodromInRussia cosmodrom3 = new CosmodromInRussia(rocket);

        CosmodromInUSA cosmodrom4 = new CosmodromInUSA(shatl);
        CosmodromInUSA cosmodrom5 = new CosmodromInUSA(spaceX);
        CosmodromInUSA cosmodrom6 = new CosmodromInUSA(rocket);



        cosmodrom1.pusk();
        System.out.println("================================");
        cosmodrom2.pusk();
        System.out.println("================================");
        cosmodrom3.pusk();
        System.out.println("================================");
        cosmodrom4.pusk();
        System.out.println("================================");
        cosmodrom5.pusk();
        System.out.println("================================");
        cosmodrom6.pusk();



    }
}
