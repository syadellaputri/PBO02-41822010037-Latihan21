/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package app.pbo02.latihan21;
import java.util.Scanner;

/**
 *
 * @author DelDel
 * Nama : Syadella Putri
 * NIM  : 41822010037
 * Nama : Anastasya Azami
 * NIM  : 41822010081
 */
public class PBO0241822010037Latihan21 {

    public static void main(String[] args) {
        System.out.println("FOrmat Latihan PBO");
        
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan banyaknya mahasiswa : ");
        int mhs=input.nextInt();
        int[]nilai=new int[mhs];
        int total=0;
        for(int i=0;i<mhs;i++){
            System.out.print("Nilai mahasiswa ke - "+(i+1)+" : ");
            nilai[i]=input.nextInt();
            total+=nilai[i];
        }
        double rataRata=(double)total/mhs;
        System.out.println("maka, rata rata nilainya adalah : "+rataRata);
    }
}
