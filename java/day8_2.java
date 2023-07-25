
import java.io.*;

public class day8_2 {

    public static void main(String[] args) {
        try {
            File myObj = new File("C:\\Users\\Sathw\\Desktop\\javatestcase\\sathwik.txt");
            if (myObj.createNewFile()) {
                System.out.println("File Created: " + myObj.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("An error Occurred");
            e.printStackTrace();
        }
    }

}