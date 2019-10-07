/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan20.targetsaldo;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : menghitung saldo tabungan hingga mencapai target
 */
public class PBO210118048Latihan20TargetSaldo {

    public static void main(String[] args) {
        int saldoAwal, target;
        
        saldoAwal = 3_500_000;
        target =  6_000_000;
        hitungSaldo(saldoAwal, target);
    }

    public static void hitungSaldo(int saldoAwal, int target) {
        int i;
        
        i = 1;
        do {
            saldoAwal += saldoAwal * 0.08; 
            System.out.print("Saldo di bulan ke-" + i +" Rp."); i++;
            System.out.printf("%,10d%n" , saldoAwal);
            if(saldoAwal >= target)
                break;
        } while (i <= 10);
    }
}
