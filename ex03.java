import java.util.ArrayList;
import java.util.Random;

public class ex03 {
    public static void main(String[] args) {
        ArrayList<Integer> list = fillingList(10);
        System.out.println(list);
        double [] arr = minMaxNumAverage(list);
        System.out.printf("максимальное значение %1$.0f Минимальное значение %2$.0f среднее арифметичское %3$.2f",arr[1],arr[0], arr[2]);
    }

    private static ArrayList<Integer> fillingList(int size) {
        ArrayList<Integer> lst = new ArrayList<Integer>(size);
        Random rand = new Random();
        for (int i = 0; i < size; i++)
            lst.add(rand.nextInt(100));
        return lst;

    }

    private static double[] minMaxNumAverage(ArrayList<Integer> lst) {
        double[] num = new double[3];
        num[0] = lst.get(0);
        num[1] = lst.get(0);
        for (int i = 0; i < lst.size(); i++){
            if (num[0] > lst.get(i))
                num[0] = lst.get(i);
            else if (num[1] < lst.get(i))
                num[1] = lst.get(i);
            num[2] += lst.get(i);
            }
        num[2] /= lst.size();
        return num;
    }

}
