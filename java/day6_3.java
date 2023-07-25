abstract class shape {
    abstract void draw();

    {
        // System.out.println();
    }
}

class circle extends shape {
    void draw() {
        System.out.println(("Drawing Circle"));
    }
}

class Rectangle extends shape {
    void draw() {
        System.out.println(("Drawing Rectangle"));
    }
}

public class day6_3 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.draw();
        circle c = new circle();
        c.draw();
        shape s1 = new Rectangle();
        s1.draw();
        shape s2 = new circle();
        s2.draw();
    }
}
