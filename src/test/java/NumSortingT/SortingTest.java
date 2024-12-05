package NumSortingT;
import org.junit.jupiter.api.Test;
import tg.bot.Sorting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;

public class SortingTest {

    @Test
    public void testRemoveDuplicates() {
        List<Integer> inputList = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> actual = Sorting.removeDuplicates(inputList);

        assertEquals(expected, actual);
    }
}