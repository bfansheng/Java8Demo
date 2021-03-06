package com.bfs.lamda.list;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/**
 * @author lwb
 * @date 2018-12-10
 */
public class ListDemo {



    @Test
    public void sort() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.sort(Comparator.comparingInt(o -> o));
        println(list);

        list.sort((a, b) -> b -a);
        println(list);
    }

    private <T>void println(List<T> list) {
        Objects.requireNonNull(list);
        System.out.println("===============begin==================");
        list.forEach(System.out::println);
        System.out.println("================end===================\n");
    }
}
