package javaChallenges;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class program10 {
    public static void main(String[] args) throws IOException {
        FileInputStream fInput=null;
        FileOutputStream foutput=null;
        try {


        fInput=new FileInputStream("example2.txt");
           foutput=new FileOutputStream("newfile.txt");
    }catch (IOException e){
        e.printStackTrace();}

    int i=0;
        try {


   while((i=fInput.read())!=-1) {
       foutput.write(i);
   }
   }catch (IOException e){
            e.printStackTrace();

   }
        finally {
            if(fInput!=null){
                fInput.close();
            }
            if(foutput!=null){
                foutput.close();
            }
        }
    }
}
