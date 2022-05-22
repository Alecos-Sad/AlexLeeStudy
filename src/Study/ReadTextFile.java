package Study;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadTextFile {
    public static void main(String[] args) throws IOException {


        File file = new File("/Users/User/Desktop/Пароли.txt");
        Scanner scan = new Scanner(file);
        String fileContent = "--- Made by SadovNick ---";

        while (scan.hasNextLine()) {
            fileContent = fileContent.concat(scan.nextLine() + "\n");
        }

        FileWriter writer = new FileWriter("/Users/User/Desktop/newFileExample.txt");
        writer.write(fileContent);
        writer.close();
    }
}
