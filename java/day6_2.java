class RBIbank {
    int getroi_fd() {
        return 6;
    }
}

class SBI extends RBIbank {
    int getroi_fd() {
        return 8;
    }
}

class ICICI extends RBIbank {
    int getroi_fd() {
        return 9;
    }
}

class AXIS extends RBIbank {
    int getroi_fd() {
        return 10;
    }
}

public class day6_2 {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("sbi roi is " + s.getroi_fd());
        System.out.println("icici roi is " + i.getroi_fd());
        System.out.println("axis roi is " + a.getroi_fd());
    }
}
