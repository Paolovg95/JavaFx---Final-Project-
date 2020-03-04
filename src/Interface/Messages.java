/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import javax.swing.JOptionPane;

/**
 *
 * @author paolovargas1
 */
public class Messages {
        public static void BusNotFoundMessage(){
            String messageinfo = " Bus Not Found - Try Again ";
            JOptionPane.showMessageDialog(null, messageinfo , " Error " , JOptionPane.INFORMATION_MESSAGE);
        }
        public static void SearchConfirmationMessage(){
            String messageinfo = " Search Succesful - QR Code available ";
            JOptionPane.showMessageDialog(null, messageinfo , " Confirmation Message " , JOptionPane.INFORMATION_MESSAGE);
            
        }
        public static void IncorrectUserOrPassword(){
            String messageinfo = " Incorrect Username or Password ";
            JOptionPane.showMessageDialog(null, messageinfo , " Login Message " , JOptionPane.INFORMATION_MESSAGE);
        }
        public static void InsertUsernameorPassword(){
            String messageinfo = " Insert Username or Password ";
            JOptionPane.showMessageDialog(null, messageinfo , " Login Message " , JOptionPane.INFORMATION_MESSAGE);
        }
       
}
