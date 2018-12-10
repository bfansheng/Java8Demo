package com.bfs.lamda.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author lwb
 * @date 2018-12-10
 */
public class ListDemo {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.sort(Comparator.comparingInt(o -> o));
        list.forEach(System.out::println);
    }

}
