import java.util.Arrays;
import java.util.List;

public class NumberListComparator {
    private List<Integer> list1;
    private List<Integer> list2;

    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(11, 12, 13, 14, 15);
        List<Integer> l2 = Arrays.asList(11, 12, 13, 14, 15);
        NumberListComparator nc = new NumberListComparator(l1, l2);
        System.out.println(nc.compareListsAndPrintMessage());
    }

    public NumberListComparator(List<Integer> list1, List<Integer> list2) {
        this.list1 = list1;
        this.list2 = list2;
    }

    public double calculateAverage(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return (double) sum / list.size();
    }

    public String compareListsAndPrintMessage() {
        double average1 = calculateAverage(list1);
        double average2 = calculateAverage(list2);

        if (average1 > average2) {
            // Среднее значение списка 1 больше среднего значения списка 2
            return "Average value of list 1 is greater than the average value of list 2";
        } else if (average1 < average2) {
            // Среднее значение списка 1 меньше среднего значения списка 2
            return "Average value of list 1 is smaller than the average value of list 2";
        } else {
            // Средние значения обоих списков равны
            return "Average values is equal";
        }
    }
}