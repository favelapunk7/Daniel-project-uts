/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.spp.npm119;

import org.spp.npm119.Model.Buku;
import org.spp.npm119.databaseutility.DatabaseUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author User
 */
public class BukuDataSource { 
    
    private Connection connection;
    private Buku buku;
    
    public BukuDataSource() {
        connection = DatabaseUtility.getConnection();
    }
    
    public List<Buku>getAll(){
        List<Buku> list = new ArrayList<>();
        String sql = "SELECT * FROM buku";
        
        try {
                PreparedStatement statement = connection.prepareStatement(sql);
                ResultSet rs = statement.executeQuery();
                Buku buku;
                while (rs.next()) {
        
                    buku = new Buku();
                    
                    buku.setIdBuku(rs.getString("idbuku"));
                    buku.setJudul(rs.getString("judul"));
                    buku.setPengarang(rs.getString("pengarang"));
                    buku.setPenerbit(rs.getString("penerbit"));
                    buku.setTahun(rs.getString("tahun"));
                    list.add(buku);
            }
        } catch (Exception e) {
        }
        return list;
    }

}

