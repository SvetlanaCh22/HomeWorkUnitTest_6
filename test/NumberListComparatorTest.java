import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberListComparatorTest {
    private NumberListComparator comparator;
    private List<Integer> list1;
    private List<Integer> list2;

    @BeforeEach
    public void setUp() {
        list1 = Arrays.asList(1, 2, 3, 4, 5);
        list2 = Arrays.asList(6, 7, 8, 9, 10);
        comparator = new NumberListComparator(list1, list2);
    }

    @Test
    public void testCalculateAverage() {
        Assertions.assertEquals(3.0, comparator.calculateAverage(list1));
        Assertions.assertEquals(8.0, comparator.calculateAverage(list2));
    }

    // Среднее значение списка 1 больше среднего значения списка 2
    @Test
    public void testCompareListsAndPrintMessage_List1Greater() {
        Assertions.assertEquals("Average value of list 1 is smaller than the average value of list 2", comparator.compareListsAndPrintMessage());
    }

    // Среднее значение списка 1 меньше среднего значения списка 2
    @Test
    public void testCompareListsAndPrintMessage_List2Greater() {
        list2 = Arrays.asList(11, 12, 13, 14, 15);
        comparator = new NumberListComparator(list1, list2);
        Assertions.assertEquals("Average value of list 1 is smaller than the average value of list 2", comparator.compareListsAndPrintMessage());
    }

    // Средние значения обоих списков равны
    @Test
    public void testCompareListsAndPrintMessage_ListsEqual() {
        list2 = Arrays.asList(1, 2, 3, 4, 5);
        comparator = new NumberListComparator(list1, list2);
        Assertions.assertEquals("Average values is equal", comparator.compareListsAndPrintMessage());
    }

    // Средние значения обоих списков равны
    @Test
    public void testCompareListsAndPrintMessage_EmptyLists() {
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
        comparator = new NumberListComparator(list1, list2);
        Assertions.assertEquals("Average values is equal", comparator.compareListsAndPrintMessage());
    }

    // Среднее значение списка 1 меньше среднего значения списка 2
    @Test
    public void testCompareListsAndPrintMessage_NegativeNumbers() {
        list1 = Arrays.asList(1, 2, -3, 4, 5);
        list2 = Arrays.asList(6, 7, 8, -9, 10);
        comparator = new NumberListComparator(list1, list2);
        Assertions.assertEquals("Average value of list 1 is smaller than the average value of list 2", comparator.compareListsAndPrintMessage());
    }
}
