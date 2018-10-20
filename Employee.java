import java.util.Scanner;
import java.io.*;

public class Employee {

    public void mail() throws IOException {
        PrintWriter writeToFile = new PrintWriter(new FileOutputStream(
                new File("c://emails.txt"),
                true));
        System.out.println("Enter your name: ");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println("Enter your surname:  ");
        String surname = in.next();
        String email = surname + "." + name + "@mex.com";
        FileReader fileReader = new FileReader("c://emails.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String textLine = bufferedReader.readLine();
        int i = 0;
        do {
            if (email.equals(textLine)) {
                System.out.println("We add digit to your email because you are next person with same name and surname");
                i++;
                email = surname + "." + name + Integer.toString(i) + "@mex.com";
                textLine = bufferedReader.readLine();
            }
        } while (textLine != null);
        bufferedReader.close();

        System.out.println("Your email address: " + email);
        writeToFile.println(email);
        writeToFile.close();
    }
}
