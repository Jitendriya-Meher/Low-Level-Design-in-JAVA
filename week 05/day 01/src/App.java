import java.util.ArrayList;
import java.util.Collection;

import javax.xml.validation.SchemaFactory;

public class App {
    public static void main(String[] args) throws Exception {

        ScorpioN obj = new ScorpioN();
        obj.driveCar();

        ScorpioClassic obj2 = new ScorpioClassic();
        obj2.driveCar();

        ScorpioFactory factory = new ScorpioFactory();

        Scorpio car1 = factory.createScorpio('C');
        car1.driveCar();

        Scorpio car2 = factory.createScorpio('N');
        car2.driveCar();

        Scorpio car3 = factory.createScorpio('x');
        car3.driveCar();

        Collection<Scorpio> list = new ArrayList<>();
        Scorpio l1 = new Scorpio();
        Scorpio l2 = new ScorpioClassic();
        list.add(l1);
        list.add(l2);

        for( Scorpio sc : list){
            sc.driveCar();
        }

    }
}
