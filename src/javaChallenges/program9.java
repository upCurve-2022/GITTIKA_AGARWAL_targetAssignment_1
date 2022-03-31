package javaChallenges;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class program9 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutput=new FileOutputStream("example2.txt",true);
        String s="I am a student of SIR MVIT\n";
        char ch[]=s.toCharArray();
        for(char c:ch){
            fileOutput.write(c);
        }
fileOutput.close();
    }
}
