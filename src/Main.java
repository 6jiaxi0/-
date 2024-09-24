import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pair<String, String>> list = new ArrayList<Pair<String, String>>();
        Pair<String, String> Pair1 = new Pair<>();
        Pair1.setKey("刘嘉雄");
        Pair1.setValue("2005-10-05");
        Pair<String, String> Pair2 = new Pair<>();
        Pair2.setKey("刘嘉雄5");
        Pair2.setValue("2005-10-05");
        list.add(Pair1);
        list.add(Pair2);
        System.out.println("Pair1 == Pair2 = " + Pair1.equals(Pair2));

    }
}