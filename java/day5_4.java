class Employee {
    float salary = 40000;
}

public class day5_4 extends Employee {
    int bonus = 10000;

    public static void main(String[] args) {
        day5_4 p = new day5_4();
        System.out.println("Programer salary is :" + p.salary);
        System.out.println("Bonus of Programer is :" + p.bonus);
    }
}
