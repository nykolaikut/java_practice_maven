package BufferedReaderDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        String obj = "EXIT";
        String str = "";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter any string: ");

        while(!str.toUpperCase().equals(obj)) {
            str = reader.readLine();
            System.out.println("Output in console : " + str);
        }
        System.out.println("Exit from the program: ");
    }
}
