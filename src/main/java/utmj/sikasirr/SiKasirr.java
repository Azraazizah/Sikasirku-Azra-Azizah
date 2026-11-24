/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package utmj.sikasirr;

/**
 *
 * @author AzraAzizah
 */
import javax.swing.JFrame;
import java.awt.Color;

public class SiKasirr extends JFrame {
    public SiKasirr() {
        setTitle("“SiKasir” — Aplikasi Kasir Toko");
        setSize(420, 320);
        //        Mengatur Warna Background
        getContentPane().setBackground(new Color(125, 192, 235));
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);        
    }

    public static void main(String[] args) {
        new SiKasirr().setVisible(true);
    }


}
