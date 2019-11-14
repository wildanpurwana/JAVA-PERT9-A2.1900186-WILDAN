/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg5;

/**
 *
 * @author Muryy
 * NAMA                 : Murry Muryadin
 * KELAS                : TI-1A
 * NIM                  : A2.1900123
 * Deskripsi Program    : Kambing Global
 */
public class Latihan5 {
    // Variabel jumlahkambing menjadi variabel instance
    
    int jumlahKambing = 88;
    
    
//Method untuk menampilkan jumlah kambing
public void getJumlahKambing() {
    System.out.println("Jumlah kambing: " +jumlahKambing);
}

public void tambahKambing() {
    jumlahKambing = jumlahKambing + 5;
    System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
}
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Latihan5 kambingSusu = new Latihan5() ;
        
        // Menampilkan jumlah kambing yang ada saar program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        // Menambah satu kambing
        kambingSusu.tambahKambing();
        
        // Menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
    
}
