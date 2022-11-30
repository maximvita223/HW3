import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ex02 {
    public static void main(String[] args) {
        List<Integer> lst = fillingList(10);
        System.out.println(lst);
        System.out.println(remover(lst));
    }

    private static List<Integer> fillingList(int size) {
        List<Integer> lst = new ArrayList<Integer>(size);
        Random rand = new Random();
        for (int i = 0; i < size; i++)
            lst.add(rand.nextInt(100));
        return lst;

    }

    private static List<Integer> remover(List<Integer> lst) {

        for (int i = 0; i < lst.size(); i++)
            if (lst.get(i) % 2 == 0) {
                lst.remove(i);
                i--;
            }
        return lst;
    }

}
