class Student {
    int roll_no;
    String s_name;
    double marks1, marks2, marks3, marks4;

    Student(int roll_no1, String s_name1) {
        roll_no = roll_no1;
        s_name = s_name1;

    }
}

public class day5_3 {
    public static void main(String[] args) {
        Student s1 = new Student(1001, "Rohith");
        System.out.println("Roll No " + s1.roll_no + " Student Name " + s1.s_name);
        Student s2 = new Student(1002, "Lohith");
        System.out.println("Roll No " + s2.roll_no + " Student Name " + s2.s_name);
    }
}
