import java.util.*;

// Student class with Comparable (Natural Sorting)
class Student implements Comparable<Student> {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Natural Sorting by marks
    public int compareTo(Student other) {
        return this.marks - other.marks;
    }

    public String toString() {
        return name + " (" + marks + ")";
    }
}

// Comparator Example (Sort by Name)
class SortByName implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class SortingObjects {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Tejas", 90));
        list.add(new Student("Darshan", 85));
        list.add(new Student("Nayan", 95));

        System.out.println("Original List: " + list);

        // Sort by marks (Comparable)
        Collections.sort(list);
        System.out.println("Sorted by Marks: " + list);

        // Sort by name (Comparator)
        Collections.sort(list, new SortByName());
        System.out.println("Sorted by Name: " + list);
    }
}
