package BufferedReaderDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final String EXIT = "EXIT";

    public static void main(String[] args) throws IOException {

        String str;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter any string: ");

        while(!(str=reader.readLine()).toUpperCase().equals(EXIT)) {
            System.out.println("Output in console : " + str);
        }
    }
}
