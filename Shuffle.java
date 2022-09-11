import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffle {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(23);
        list.add(25);
        list.add(12);
        list.add(5);
        Collections.shuffle(list);
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
