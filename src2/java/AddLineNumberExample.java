package src2.java;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {
    public static void main(String[] args) throws Exception {
        String filePath = "src2/java/AddLineNumberExample.java";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 1;
            while ((line = br.readLine()) != null) { 
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }
        }

    }
}
