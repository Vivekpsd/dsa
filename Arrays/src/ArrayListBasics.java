import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListBasics {
    public static void main(String[] args) {
        // don't know size

        // Syntax
        ArrayList<Integer> list = new ArrayList<>(10);

        //methods
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(50);
        list.add(100);

        list.remove(1);

        list.get(2);
        list.set(3, 1000);

        System.out.println(list.contains(10));

        System.out.println(list.toString());

        //2D ArrayList

        ArrayList<ArrayList<Integer>> newList = new ArrayList<>();

        // initialization
        for (int i = 0; i < 3; i++) {
            newList.add(new ArrayList<>());
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(newList.get(i).toString());
        }

    }

}
