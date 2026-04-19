package collection.comparableandcomparator;

import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Student s) {
        return this.id  -s.id;
    }

    public String toString() {
        return id + " " + name;
    }
}

class ComparableDemo2 {
    public static void main(String[] args) {

        // Step 1: Create List instead of Map
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(3, "Sudarshan"));
        list.add(new Student(1, "Pradeep"));
        list.add(new Student(2, "Sumit"));

        // Step 2: Sort using Comparable
        Collections.sort(list);

        // Step 3: Print
        for (Student s : list) {
            System.out.println(s);
        }
    }
}