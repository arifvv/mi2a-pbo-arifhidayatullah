/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arif150323;

/**
 *
 * @author lenovo
 */
/*
    Nama Kelompok Project:
    1. Andre Mahesa Putra
    2. Rifki Mulfianda
    3. Arif Hidayatullah
*/
import java.util.*;
public class HitungKalori {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int umur,bb,tb;
        char ulang;
        String jekel;
        double kal=0;
        
        System.out.println("\t=Hitung Kalori Tubuh=");
        
        do{
        System.out.print("\nMasukkan Jenis Kelamain (L/P) : ");
        jekel=in.next();
        System.out.print("Masukkan Umur : ");
        umur=in.nextInt();
        System.out.print("Masukkan Berat Badan(kg) : ");
        bb=in.nextInt();
        System.out.print("Masukkan Tinggi Badan(cm) : ");
        tb=in.nextInt();
        
        if(jekel.equals("L")||jekel.equals("l")){
            kal=(88.4+13.4*bb)+(4.8*tb)-(5.68*umur);
            
            System.out.println("\n--Kalori Tubuh Anda--");
            System.out.println("Jenis Kelamin : Laki - Laki");
            System.out.println("Umur : "+umur+" tahun");
            System.out.println("Berat Badan: "+bb+"kg");
            System.out.println("Tinggi Badan: "+tb+"cm");
            System.out.println("Kalori Tubuh : "+kal+"kal");
        }
        else{
            kal=(447.6 + 9.25*bb)+(3.10*tb)-(4.33*umur);
            
            System.out.println("\n--Kalori Tubuh Anda--");
            System.out.println("Jenis Kelamin : Perempuan");
            System.out.println("Umur : "+umur+" tahun");
            System.out.println("Berat Badan: "+bb+"kg");
            System.out.println("Tinggi Badan: "+tb+"cm");
            System.out.println("Kalori Tubuh : "+kal+"kal");
        }
        System.out.print("\nCek Kalori Kembali ?(Y/N) : ");
        ulang=in.next().charAt(0);
        }while(ulang=='Y'||ulang=='y');
    }
}
