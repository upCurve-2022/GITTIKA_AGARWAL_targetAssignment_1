package javaChallenges;

import java.io.File;
import java.io.IOException;

public class program8 {
    public static void main(String[] args) {
        File myFile=new File("firstfile.txt");

        try {
            myFile.createNewFile();
            System.out.println("New file is being created : "+ myFile.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
