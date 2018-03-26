package pl.kata.autobus;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class MetroTest {

    Metro metro;

    public void setup() {
        metro = new Metro();
    }

    @Test
    public void metroTest_1() {
        setup();

        List<int[]> list = new ArrayList<>();
        list.add(new int[]{10, 0});
        list.add((new int[]{3, 5}));
        list.add(new int[]{2, 5});
        assertThat(metro.countPassengers(list), comparesEqualTo(5));

        list.add(new int[]{10, 3});
        assertThat(metro.countPassengers(list), comparesEqualTo(12));
    }

    @Test
    public void metroTest_2() {
        setup();

        List<int[]> list = new ArrayList<>();
        list.add(new int[] {1, 0});
        list.add(new int[] {2, 1});
        list.add(new int[] {2, 1});
        assertThat(metro.countPassengers2(list), comparesEqualTo(3));
        System.out.println(metro.countPassengers2(list));
    }

    @Test
    public void rozruch() {
        List<Integer> myList = Arrays.asList(5, 4, 7);
        assertThat(myList, contains(5, 4, 7));
    }
}
