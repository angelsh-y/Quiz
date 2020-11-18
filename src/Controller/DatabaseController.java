/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Jurusan;
import Model.Mahasiswa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author 1119038 Elangel Neilea Shaday
 */
public class DatabaseController {
    static DatabaseHandler conn = new DatabaseHandler();
    
    //INSERT
    public static boolean insert(Mahasiswa mhs){ //get from model ex: User user for parameter
        conn.connect();
        String query = "INSERT INTO mahasiswa VALUES (?,?,?,?)";
        try{
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, mhs.getNIM());
            stmt.setString(2, mhs.getNama());
            stmt.setString(3, mhs.getKode_jurusan());
            stmt.setInt(4, mhs.getAngkatan());
            return true;
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    
    public static boolean insert(Jurusan jurusan){ //get from model ex: User user for parameter
        conn.connect();
        String query = "INSERT INTO mahasiswa VALUES (?,?,?,?)";
        try{
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, jurusan.getKode());
            stmt.setString(2, jurusan.getNama());
            return true;
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
}
