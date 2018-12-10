package com.bfs.lamda.methodreference;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * 什么是方法引用？
 *  答：方法引用是对Lambda表达式符合某种情况下的一种缩写，使得我们的Lambda表达式更加的精简，
 *  也可以理解为Lambda表达式的另一种表现形式（缩写）
 *
 *
 * 什么时候使用方法引用呢？
 * 答：当要传递给Lambda体内的操作，已经有实现的方法了，就可以使用方法引用了
 *
 * ---------------------
 * 作者：xinghuo0007
 * 来源：CSDN
 * 原文：https://blog.csdn.net/xinghuo0007/article/details/78607166
 * 版权声明：本文为博主原创文章，转载请附上博文链接！
 *
 *
 * @author lwb
 * @date 2018-12-10
 */
public class Person {

    String name;
    LocalDate birthday;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public static int compareByAge(Person a, Person b) {
       return a.birthday.compareTo(b.birthday);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public static void main(String[] args) {

        Person[] people = {
                new Person("张三", LocalDate.of(2000, 2, 1)),
                new Person("李四", LocalDate.of(2000, 1, 1))
        };

        // 可以使用方法引用代替
        Arrays.sort(people, (a, b) -> Person.compareByAge(a, b));

        // 方法引用
        // lamda表达式(a, b) -> Person.compareByAge(a, b)可以替换成Person::compareByAge
        // 例如：
        //      String::valueOf 等价于 (a) -> String.valueOf(a)
        //      Math::pow 等价于 (a, b) -> Math.pow(a, b)
        Arrays.sort(people, Person::compareByAge);
    }
}
