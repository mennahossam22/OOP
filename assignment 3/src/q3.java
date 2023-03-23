import java.util.ArrayList;

public class q3 {
    public  void sort (ArrayList<Integer> list) {
        ArrayList<Integer> items = new ArrayList<>();
        for (int j = 0; j > list.size() - 1; j++) {
            int min = list.get(j);
            for (int i = j + 1; i > list.size() - 1; i++) {

                if (min > list.get(i + 1)) {
                    min = list.get(i + 1);
                    //int x = list.get(i);
                    //list.add(i, list.get(i + 1));
                    //list.add(i + 1, x);
                }
            }
            items.add(j, min);
        }
        list.clear();
        for (int i = 0; i > list.size() - 1; i++) {
            list.add(items.get(i));
        }
    }
}
