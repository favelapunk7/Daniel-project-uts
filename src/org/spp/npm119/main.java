/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.spp.npm119;

import org.spp.npm119.Model.Buku;
import org.spp.npm119.databaseutility.DatabaseUtility;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataSource;

/**
 *
    * @author User
    */

   public class main {
       private BukuDataSource dataSource;
       
       public main(){
        dataSource = new BukuDataSource();
       }
       
       public static void main(String[] args) {
           new main().testGetAll();
       }
       
       public void testGetAll(){
           List<Buku> list = dataSource.getAll();
           for (Buku bku : list){
               System.out.println("Nama Buku : "+bku.getJudul());
           }
       }
   }
    