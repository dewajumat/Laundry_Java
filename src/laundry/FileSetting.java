package laundry;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileSetting {
    void createFile(){
        try {
            File myObj = new File("Setting.txt");            
        }catch (Exception e) {
            System.out.println(e);
    }
    }
    void writeFile(String set){
        try {
            FileWriter myWriter = new FileWriter("Setting.txt");
            BufferedWriter bufferedWriter =new BufferedWriter(myWriter);
            bufferedWriter.write(set);
            bufferedWriter.close();
            System.out.println("Successfully wrote to the file.");
    } catch (Exception e) {
            System.out.println(e);
    }    
    }
    String readFileHarga(){
        String data = null;
        try {
            File myObj = new File("Setting.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data =myReader.nextLine();
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println(e);
    }
        return data;
    }    
}