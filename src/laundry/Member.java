package laundry;

public class Member extends Costumer{
    private int poin;
    private String idmem;
    String usePoin(String idInput,int harga,int berat){        
        try{
            execute("SELECT idmem as idmem FROM `member` where idmem = '"+idInput+"'");
            getHasil().next();
            idmem = getHasil().getString("idmem");
            System.out.println(idmem);
                if (idmem.equals(idInput)){
                    execute("SELECT poin as poin FROM `member` where idmem = '"+idInput+"'");
                    getHasil().next();
                    poin=getHasil().getInt("poin");
                    if (poin<50){
                        poin = poin+(harga/1000);
                        gExecute("update `member` SET poin = "+poin+" where idmem = '"+idInput+"'");
                        setStats("Transaksi Berhasil \nHarga:"+harga+"\n");
                    }
                    else{
                        poin = poin-50;
                        harga = harga-5000;
                        setStats("Mendapat Potongan 5000 karena poin sudah mencapai 50\nTransaksi Berhasil \nHarga:"+harga+"\n");
                        gExecute("update `member` SET poin = "+poin+" where idmem = '"+idInput+"'");
                    }
                    
                }
            gExecute("INSERT INTO `transaksi` (`berat`, `biaya`) VALUES("+berat+", "+harga+")");              
            }
        catch(Exception e){
            System.out.println(e);
            setStats("Id Member Salah");
            System.exit(0);
            }
        return getStats();
    }
}
