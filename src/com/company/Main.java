package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        List<Student> cats_students = new ArrayList<>();
        cats_students.add(new Student("Мяуч", "Мя", 18, 666));
        cats_students.add(new Student("Арыч", "Ар", 25, 143));
        cats_students.add(new Student("Кусович", "Ауч", 9, 356));
        cats_students.add(new Student("Ресгисович", "Алко", 24, 143));
        cats_students.add(new Student("Мурович", "Китий", 15, 437));
        cats_students.add(new Student("Пупкина", "Маргарита", 15, 437));
        cats_students.add(new Student("Тарасов", "Слонив", 50, 1433));
        cats_students.add(new Student("Меевич", "Адс", 14, 437));
        cats_students.stream().filter(new Predicate<Student>() {
                    @Override
                    public boolean test(Student cat) {
                        return !cat.Name.equals("Адс");
                    }
                }).sorted(new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o1.Name.compareTo(o2.Name);
                    }
                })
                .forEach(cat_stud -> System.out.println(cat_stud));

        //System.out.println(cats_students);
    }
}
