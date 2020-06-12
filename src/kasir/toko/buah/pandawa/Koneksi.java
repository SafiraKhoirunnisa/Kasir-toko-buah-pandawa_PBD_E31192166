/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir.toko.buah.pandawa;

import java.sql.*;

public class Koneksi {
public Koneksi() throws SQLException{
    bukaKoneksi();
}
public Connection bukaKoneksi()throws SQLException{
    Connection con=null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/toko buah pandawa", "root", "");
        return con;
    }
    catch(SQLException se){
        System.out.println("No Connection open");
        return null;
    }
catch(Exception ex){
    System.out.println("Cound not open connection");
    return null;
}
}
    public static void main(String[] args) throws SQLException{
        Koneksi projek = new Koneksi();
        System.out.println(projek);
    }
}
