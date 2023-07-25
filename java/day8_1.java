import java.io.File;
import java.util.*;

public class day8_1 {
    public static void main(String[] args) {
        System.out.println("enter the path where you want to create a folder");
        Scanner sc = new Scanner(System.in);
        String path = sc.next();
        System.out.println("ente the name of the described directory");
        path = path + sc.next();
        File f1 = new File(path);
        boolean bool = f1.mkdir();
        if (bool) {
            System.out.println("Folder is created Sucessfully");
        } else {
            System.out.println("Error foud!");
        }
    }
}
