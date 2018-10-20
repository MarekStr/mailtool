import java.util.Scanner;
import java.io.*;

public class Employee {

    public void mail() throws IOException {
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
           textLine = bufferedReader.readLine();
            if (email.equals(textLine)) {
                System.out.println("We add digit to your email because you are next person with same name and surname");
                i++;
                email = surname + "." + name + Integer.toString(i) + "@mex.com";
            }
        } while (textLine != null);
        bufferedReader.close();

        System.out.println("Your email address: " + email);
        PrintWriter writeToFile = new PrintWriter(new FileOutputStream(
                new File("c://emails.txt"),
                true));
        writeToFile.println(email);
        writeToFile.close();
    }
}
