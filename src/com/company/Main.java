package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> listing = new ArrayList<>();
        listing.add(new Student("Мяу", "Мяуч", 18, 666));
        listing.add(new Student("Ар", "Арыч", 25, 143));
        System.out.println(listing);
    }
}
