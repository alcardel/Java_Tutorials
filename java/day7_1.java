interface printable {
    public void print();
}

class A6 implements printable {
    public void print() {
        System.out.println("Hello");
    }
}

public class day7_1 {
    public static void main(String args[]) {
        A6 obj = new A6();
        obj.print();
    }
}