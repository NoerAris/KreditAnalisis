/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.entity;

/**
 *
 * @author user
 */
public class MNasabah {
     private String nama;
     private int telp;
     private String alamat; 
    
     private double gajiPokok;
     private double penghasilanTambahan;
     private double bonus;
     private int jumlahTanggungan;
     

    public MNasabah(double gaPok, double tambahan, double bonus, int jumlahTanggungan) {     
        this.gajiPokok = gaPok;
        this.penghasilanTambahan = tambahan;
        this.bonus = bonus;
        this.jumlahTanggungan = jumlahTanggungan;
    }

   
     private double hitungPenghasilanBulanan(){             
         return this.gajiPokok + this.penghasilanTambahan + this.bonus;
    
    }
      public double hitungLimitPinjaman() {
        return this.hitungPenghasilanBulanan()/(this.jumlahTanggungan + 1);
    }
      
   
}
