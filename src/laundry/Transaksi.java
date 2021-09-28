package laundry;

public class Transaksi extends Cucian{
    private int errorStatus=0;
    private int harga;    
    String proses(String inIdCucian){
        FileSetting setting = new FileSetting();
        int setharga = Integer.parseInt(setting.readFileHarga());
        try{
        execute("SELECT `berat` FROM `cucian` WHERE idCucian = '"+inIdCucian+"' ;");
        getHasil().next();
        setBerat(getHasil().getInt("berat"));
        harga = getBerat()*setharga;
        }
        catch(Exception e){
        System.out.println(e);
        setStats("Id Cucian Salah");
        this.errorStatus = 1;
        }
        return getStats();
    }
    int getError(){
        return errorStatus;
    }
    String nonMemProses(){
        try{
           gExecute("INSERT INTO `transaksi` (`biaya`) VALUES("+harga+")"); 
           setStats("Transaksi Berhasil \nHarga:"+harga+"\n");
        }
        catch(Exception e){
            System.out.println(e);
        }
        return getStats();
    }
}
