package laundry;

import java.util.*;

public class Cucian extends Sql {
    private String idCucian="0";
    private int berat;
    
    void setBerat(int newberat){
        this.berat = newberat;
    }
    int getBerat(){
        return berat;
    }
    String inputCucian(int berat){
        idCucian = "0";
        this.berat = berat;
        ArrayList numbers = new ArrayList();
        for(int i = 0; i < 10; i++){
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        for(int j = 0; j < 6; j++)
        {
            idCucian = idCucian + numbers.get(j);
        }
        try{
            gExecute("INSERT INTO `cucian` (`idCucian`, `berat`, `status`) VALUES('"+idCucian+"', "+this.berat+",'Belum')");
        }
        catch(Exception e){
            System.out.println(e);
        }
        return idCucian;
    }
    void changeStats(String idCucian){
            gExecute("update `cucian` SET status = 'Selesai' where idCucian = '"+idCucian+"'");
    }
}
