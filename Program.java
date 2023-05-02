import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        Toy toy1 = new Toy(0, "Робот", 25);
        Toy toy2 = new Toy(1, "Машинка", 40);
        Toy toy3 = new Toy(2, "Кукла", 30);
        Toy toy4 = new Toy(3, "Конструктор", 65);

        List<Toy> toys = new ArrayList<Toy>();
        toys.add(toy1);
        toys.add(toy2);
        toys.add(toy3);
        toys.add(toy4);

        ToysMachine toysMachine = new ToysMachine(toys);
        toysMachine.saveToyForLottery();
        toysMachine.saveToyForLottery();
        toysMachine.saveToyForLottery();
        toysMachine.saveToyForLottery();
    }
}