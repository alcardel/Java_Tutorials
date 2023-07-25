public class day7_4 {
    public static void main(String args[]) {
        try {
            int data = 100 / 0;
            System.out.println(data);
            String s = "java";
            System.out.println(s.length());
            String a = "100";
            int i = Integer.parseInt(a);
            System.out.println(i);
            int b[] = new int[5];
            b[6] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        System.out.println("rest of the code...");
    }
}
