package kg.nurkan;

import java.io.*;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {

            System.out.println("enter path to the file...");

            String name = myObj.nextLine();

            File file = new File(String.valueOf(name));

            if (file.isFile()) {
                System.out.println("file: " + file.getName());

                FileInputStream stream = new FileInputStream(file);
                StringBuilder sb = new StringBuilder();

                try(BufferedReader br = new BufferedReader(new InputStreamReader(stream))) {
                    String line;

                    while ( (line = br.readLine()) != null) {
                            sb.append(line).append(System.lineSeparator());
                    }

                    System.out.println(sb);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
