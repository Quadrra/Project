/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lh1.project;

import java.sql.*;
import java.tuil.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SHS-PC2
 */
public class LoginConnect 
{
    public static connection connectDB()
    {
    Connection con=null;
         try
            {
           con=DriveManager.getConnection("jdbc:derby://localhost:1527/ArtistDB", "Akumu", "Kaleidoscope");
         } catch (SQLException ex)
         {
             Logger.getLogger(TABLET_RAAAAH.class.getName()).log(Level.SEVERE, null)
         }
    }
}
