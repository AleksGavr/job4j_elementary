package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3Num() {
        int[] data = new int[]{4, 1, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5Num() {
        int[] data = new int[]{8, 4, 9, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{2, 4, 5, 8, 9};
        assertThat(result).containsExactly(expected);
    }
}
