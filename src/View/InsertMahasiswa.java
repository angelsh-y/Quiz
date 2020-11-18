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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author 1119038 Elangel Neilea Shaday
 */
public class InsertMahasiswa implements ActionListener{
    JFrame Frame;
    JLabel NIM, Nama, KodeJurusan, Angkatan;
    JTextField ViewNIM, ViewNama, ViewAngkatan;
    JComboBox ViewKodeJurusan;
    String list[] = {"","A", "B", "C"};
    JButton Insert;
    
    InsertMahasiswa(){
        Frame = new JFrame("Insert Mahasiswa");
        
        NIM = new JLabel("NIM");
        NIM.setBounds(20,10,100,30);
        Frame.add(NIM);
        ViewNIM = new JTextField();
        ViewNIM.setBounds(150,15,100,30);
        Frame.add(ViewNIM);
        
        Nama = new JLabel("Nama");
        Nama.setBounds(20,50,100,30);
        Frame.add(Nama);
        ViewNama = new JTextField();
        ViewNama.setBounds(150,55,200,30);
        Frame.add(ViewNama);
        
        KodeJurusan = new JLabel("Kode Jurusan");
        KodeJurusan.setBounds(20,90,100,30);
        Frame.add(KodeJurusan);
        ViewKodeJurusan = new JComboBox(list);
        ViewKodeJurusan.setBounds(150,95,100,30);
        Frame.add(ViewKodeJurusan);
        
        Angkatan = new JLabel("Angkatan");
        Angkatan.setBounds(20,130,100,30);
        Frame.add(Angkatan);
        ViewAngkatan = new JTextField();
        ViewAngkatan.setBounds(150,135,100,30);
        Frame.add(ViewAngkatan);
        
        Insert = new JButton("Insert");
        Insert.setBounds(260,200,100,30);
        Insert.addActionListener(this);
        Frame.add(Insert);
        
        Frame.setLayout(null);
        Frame.setSize(400,300);
        Frame.setLocationRelativeTo(null);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setVisible(true);
        Frame.setResizable(false);
    }
    
    public boolean checkAllData(){
        if(ViewNIM.getText().equals("")){
            return false;
        }
        if(ViewNama.getText().equals("")){
            return false;
        }
        if(ViewKodeJurusan.getItemAt(ViewKodeJurusan.getSelectedIndex()).equals("")){
            return false;
        }
        if(ViewAngkatan.getText().equals("")){
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
        InsertMahasiswa menu = new InsertMahasiswa();
    }
}
