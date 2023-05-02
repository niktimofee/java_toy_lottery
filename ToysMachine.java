import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ToysMachine {
    private List<Toy> toys;

    public ToysMachine(List<Toy> toys) {
        this.toys = toys;
    }
    
    public Toy getToy() {
        RandomToySelection random = new RandomToySelection();
        Toy toy = random.chooseByWeight(toys);
        return toy;
    }

    public void saveToyForLottery() {
        Toy toy = getToy();
        String text = toy.toString();
        try(FileWriter writer = new FileWriter("java_toy_lottery/Toys.txt", true))
        { 
            writer.write(text);
            writer.append('\n');
            writer.flush();
        }
        catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        toys.remove(toy);
    }
}