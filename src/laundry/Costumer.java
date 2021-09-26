package laundry;

public class Costumer extends Sql{
    private static String id,id1,id2;
    String register(String nama, String nohp){
        try{
            execute("SELECT max(id) AS maxid FROM `member`");            
            getHasil().next();
            id1=String.valueOf(getHasil().getInt("maxid")+1);
            if(id1.length()==1){
            id1="000"+(id1);}
            if(id1.length()==2){
            id1="00"+(id1);}
            if(id1.length()==3){
            id1="0"+(id1);}
            if(id1.length()==4){
            id1=""+(id1);}
            id2 = nohp.substring(nohp.length() - 4);
            id=""+id1+""+id2;
            gExecute("INSERT INTO `member` (`idmem`, `nama`, `nohp`,`poin`) VALUE('"+id+"','"+nama+"', '"+nohp+"', 0)");            
            setStats("Penyimpanan Data Berhasil \nNo Member:"+id+"\n");
        }
        catch(Exception e){
            System.out.println(e);
        }
        return getStats();
    }
}
