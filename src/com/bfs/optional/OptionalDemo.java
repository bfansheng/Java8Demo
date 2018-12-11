package com.bfs.optional;

import com.bfs.lamda.methodreference.Person;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Optional;

/**
 * @author lwb
 * @date 2018/12/11
 */
public class OptionalDemo {

    @Deprecated
    public static Person getRealPerson(Person person) {
        if (person == null) {
            return null;
        } else if (Objects.isNull(person.getName()) || "".equals(person.getName())) {
            return null;
        } else if (Objects.isNull(person.getBirthday())) {
            return null;
        } else {
            return person;
        }
    }

    public static Person getRealPersonByOptional(Person person) {
        return Optional.ofNullable(person)
                .filter(Objects::nonNull)
                .filter(p -> Objects.nonNull(p.getName()))
                .filter(p -> !"".equals(p.getName()))
                .filter(p -> Objects.nonNull(p.getBirthday()))
                .orElse(null);
    }

    public static void main(String[] args) {
        Person person = new Person("zhangsan", LocalDate.now());
        System.out.println(getRealPerson(person));
        System.out.println(getRealPersonByOptional(person));
    }

}
