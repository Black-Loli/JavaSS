package com.company;

public class Student {
    String Surname;
    String Name;
    int Age;
    int Group;

    public Student(String Surname, String Name, int Age, int Group) {
        this.Surname = Surname;
        this.Name = Name;
        this.Age = Age;
        this.Group = Group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Surname='" + Surname + '\'' +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Group=" + Group +
                '}';
    }
}
