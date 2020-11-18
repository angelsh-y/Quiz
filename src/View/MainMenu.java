/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

/**
 *
 * @author 1119038 Elangel Neilea Shaday
 */
public class MainMenu implements ActionListener{
    //Variabel MainMenu
    private JFrame Frame;
    private JLabel Menu;
    private JButton InsertJurusan, ViewJurusan, InsertMahasiswa, ViewMahasiswa;
    
    private JTextField textField;
    private JComboBox comboBox;
    private String textBox[] = {"A", "B", "C"};
    private ButtonGroup buttonGroup, gender, goldar;
    private JRadioButton radioButton, male, female;
    private JCheckBox checkbox;
    private JFileChooser file;
    //Date
    private UtilDateModel dateModel;
    private Properties p;
    private JDatePanelImpl datePanel;
    private JDatePickerImpl namaDatePicker;
    
    public MainMenu(){
        Frame = new JFrame("Main Menu");
        
        Menu = new JLabel("Menu");
        Menu.setBounds(230,10,100,30);
        Frame.add(Menu);
        
        InsertJurusan = new JButton("Insert Data Jurusan Baru");
        InsertJurusan.setBounds(150,40,200,30);
        InsertJurusan.addActionListener(this);
        Frame.add(InsertJurusan);
        
        ViewJurusan = new JButton("Lihat Data Semua Jurusan");
        ViewJurusan.setBounds(150,80,200,30);
        ViewJurusan.addActionListener(this);
        Frame.add(ViewJurusan);
        
        InsertMahasiswa = new JButton("Insert Data Mahasiswa Baru");
        InsertMahasiswa.setBounds(150,120,200,30);
        InsertMahasiswa.addActionListener(this);
        Frame.add(InsertMahasiswa);
        
        ViewMahasiswa = new JButton("Lihat Data Mahasiswa Per Jurusan");
        ViewMahasiswa.setBounds(150,160,200,30);
        ViewMahasiswa.addActionListener(this);
        Frame.add(ViewMahasiswa);
        
        Frame.setLayout(null);
        Frame.setSize(500,260);
        Frame.setLocationRelativeTo(null);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setVisible(true);
        Frame.setResizable(false);
    }
    
    public boolean checkAllData(){
        return true;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        if(action.equals("Insert Data Jurusan Baru")){
            if(checkAllData() == false){
                JOptionPane.showMessageDialog(null,"Silahkan Lengkapi Data!");
            }else{}
        }else if(action.equals("Lihat Data Semua Jurusan")){
            
        }else if(action.equals("Insert Data Mahasiswa Baru")){
            
        }else if(action.equals("Lihat Data Mahasiswa Per Jurusan")){
            
        }
    }
}
