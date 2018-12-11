package com.bfs.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author lwb
 * @date 2018/12/11
 */
public class ListDemo {

    private List<Integer> list = Arrays.asList(1, 3, 5, 7, 9);

    @Test
    public void test() {
        Objects.requireNonNull(list);
        List<Integer> collect = list.stream().sorted((a, b) -> b -a).collect(Collectors.toList());
        println(collect);
    }

    private <T>void println(List<T> list) {
        Objects.requireNonNull(list);
        System.out.println("===============begin==================");
        list.forEach(System.out::println);
        System.out.println("================end===================\n");
    }

}
