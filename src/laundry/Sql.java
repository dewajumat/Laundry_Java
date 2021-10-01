package laundry;

//dewajumat

import java.sql.*;

public class Sql {
    private static Connection link;
    private static Statement stmt;    
    private static ResultSet rs;
    private String stats;
    String stats(){
        try {
            link = DriverManager.getConnection("jdbc:mysql://localhost/laundry","root","");         
            stmt = link.createStatement();
            stats = "Koneksi Berhasil \n";
        } catch (SQLException e) {
            System.out.println(e);
            stats = "Koneksi Gagal \n";
        }
        return stats;
    }
    void execute(String querry){
        try{
            rs = stmt.executeQuery(querry);
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }void gExecute(String querry){
        try{
            stmt.execute(querry);
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
    ResultSet getHasil(){
        return rs;
    }
    void setStats(String newStatus){
        this.stats = newStatus;
    }
    String getStats(){
        return stats;
    }
}