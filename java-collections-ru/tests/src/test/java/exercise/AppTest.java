package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;


import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testNotEmpty() {
        // BEGIN
        List<Integer> list1 = App.take((Arrays.asList(1, 2, 3, 4)), 3);
        assertThat(list1).isNotEmpty();

        // END
    }
    @Test
    void testQueneElements() {
        // BEGIN
        List<Integer> list2 = App.take((Arrays.asList(1, 2, 3, 4)), 3);
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1, 2, 3));
        //expectedList.add(1);
        //expectedList.add(2);
        //expectedList.add(3);
        assertThat(list2).isEqualTo(expectedList);

        // END
    }
    @Test
    void testSizeList() {
        // BEGIN
        List<Integer> list2 = App.take((Arrays.asList(1, 2, 3, 4)), 3);
        assertThat(list2).hasSize(3);

        // END
    }
}
