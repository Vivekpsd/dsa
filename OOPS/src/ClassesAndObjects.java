public class ClassesAndObjects {
    public static void main(String[] args) {
        // store 5 roll numbers
        int[] roll = new int[5];

        // store 5 names of students
        String[] names = new String[5];

        // store 5 student's data?
        Student vivek = new Student();

        Student student = new Student();

    }
}

class Student {
    int roll;
    String name;
    float marks;

    Student() {
        // internally calling: new Student(12, "Vivek", 90.3f);
        this(12, "Vivek", 90.3f);
    }

    Student(int roll, String name, float marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
}
