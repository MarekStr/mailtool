import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        PrintWriter writeToFile = new PrintWriter(new FileOutputStream(
                new File("c://emails.txt"),
                true));

        System.out.println("Press 1 for add new user" + "\n" + "Press 2 for print file" + "\n" + "Press 3 to exit" + "\n");
        Scanner s = new Scanner(System.in);
        int firstNumber = s.nextInt();
        while (firstNumber != 3)

            if (firstNumber == 1) {
                System.out.println("Add new user");
                Employee e1 = new Employee();
                e1.mail();
                System.out.println("Press 1 for add new user" + "\n" + "Press 2 for print file" + "\n" + "Press 3 to exit" + "\n");
                firstNumber = s.nextInt();

            } else if (firstNumber == 2) {
                ReadFromFile.readFile("c://emails.txt");
                System.out.println("Press 1 for add new user" + "\n" + "Press 2 for print file" + "\n" + "Press 3 to exit" + "\n");
                firstNumber = s.nextInt();

            } else {
                System.out.println("Press correct number");
                System.out.println("Press 1 for add new user" + "\n" + "Press 2 for print file" + "\n" + "Press 3 to exit" + "\n");
                firstNumber = s.nextInt();

            }
    }
}