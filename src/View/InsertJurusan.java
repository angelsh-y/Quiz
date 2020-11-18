/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.DatabaseController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author 1119038 Elangel Neilea Shaday
 */
public class InsertJurusan implements ActionListener{
    JFrame Frame;
    JLabel Kode, Nama;
    JTextField ViewKode, ViewNama;
    JButton Insert;
    
    InsertJurusan(){
        Frame = new JFrame("Insert Jurusan");
        
        Kode = new JLabel("Kode");
        Kode.setBounds(20,10,100,30);
        Frame.add(Kode);
        ViewKode = new JTextField();
        ViewKode.setBounds(120,15,150,30);
        Frame.add(ViewKode);
        
        Nama = new JLabel("Nama Jurusan");
        Nama.setBounds(20,50,100,30);
        Frame.add(Nama);
        ViewNama = new JTextField();
        ViewNama.setBounds(120,55,150,30);
        Frame.add(ViewNama);
        
        Insert = new JButton("Insert");
        Insert.setBounds(170,110,100,30);
        
        Frame.add(Insert);
        
        Frame.setLayout(null);
        Frame.setSize(300,200);
        Frame.setLocationRelativeTo(null);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setVisible(true);
        Frame.setResizable(false);
    }
    
    public boolean checkAllData(){
        if(ViewKode.getText().equals("")){
            return false;
        }
        if(ViewNama.getText().equals("")){
            return false;
        }
        return true;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        if(action.equals("Insert")){
            if(checkAllData() == false){
                JOptionPane.showMessageDialog(null,"Silahkan Lengkapi Data!");
            }else{
                JOptionPane.showMessageDialog(null,"Berhasil Insert Data Baru!");
                DatabaseController Data = new DatabaseController();
            }
        }
    }
    
    public static void main(String[] args) {
        InsertJurusan menu = new InsertJurusan(); 
    }
}
