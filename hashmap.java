import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        students.put(1, "Tejas");
        students.put(2, "Darshan");
        students.put(3, "Nayan");

        System.out.println("Student List: " + students);

        System.out.println("Student with Roll 2: " + students.get(2));
    }
}
