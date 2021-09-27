package laundry;

public class Transaksi extends Cucian{
    private int errorStatus=0;
    private int harga;    
    String proses(String inIdCucian){
        try{
        execute("SELECT `berat` FROM `cucian` WHERE idCucian = '"+inIdCucian+"' ;");
        getHasil().next();
        setBerat(getHasil().getInt("berat"));
        harga = getBerat()*5000;
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
           gExecute("INSERT INTO `transaksi` (`berat`, `biaya`) VALUES("+getBerat()+", "+harga+")"); 
           setStats("Transaksi Berhasil \nHarga:"+harga+"\n");
        }
        catch(Exception e){
            System.out.println(e);
        }
        return getStats();
    }
}
