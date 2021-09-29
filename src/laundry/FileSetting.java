package laundry;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileSetting {
    ArrayList<String> setting = new ArrayList<String>();
    void createFile(){
        try {
            File myObj = new File("Setting.txt");            
        }catch (Exception e) {
            System.out.println(e);
    }
    }
    void writeFile(String setharga, String nama1, String harga1){
        try {
            FileWriter myWriter = new FileWriter("Setting.txt");
            BufferedWriter bufferedWriter =new BufferedWriter(myWriter);
            String str=String.format("""
                       %s
                       %s
                       %s              
                       """,setharga,nama1,harga1);
            bufferedWriter.write(str);
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
                setting.add(data);
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println(e);
    }
        return data;
    }    
}