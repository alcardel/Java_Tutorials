class vehicle {
    void run() {
        System.out.println("vehicle is Running");
    }
}

class Bike extends vehicle {

    void run() {
        System.out.println("Bike is Running Safely");
    }
}

public class day6_1 {
    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.run();

    }
}
