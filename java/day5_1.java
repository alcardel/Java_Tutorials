class Student {
    int roll_no;
    String stu_name;
    double marks1, marks2, marks3, marks4;

    public void average() {
        double avg = (marks1 + marks2 + marks3 + marks4) / 4;
        System.out.println("Average Marks of the student is: " + avg);
    }
}

class day5_1 {
    public static void main(String[] args) {
        // Creating object for class "Student"
        Student s1 = new Student();
        System.out.println("S1 roll no before assignment " + s1.roll_no);
        s1.roll_no = 1001;
        System.out.println("S1 roll no " + s1.roll_no);
        s1.stu_name = "Mohan";
        System.out.println("s1 " + s1.stu_name);
        s1.marks1 = 99.0;
        System.out.println("s1 marks1" + s1.marks1);
        s1.marks2 = 85.0;
        System.out.println("s1 marks2" + s1.marks2);
        s1.marks2 = 95.0;
        System.out.println("s1 marks3" + s1.marks3);
        s1.marks2 = 75.0;
        System.out.println("s1 marks4" + s1.marks4);
        s1.average();
    }
}
